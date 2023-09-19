package com.usuarios.crud.cal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.usuarios.crud.cal.dto.ClientDTO;
import com.usuarios.crud.cal.entities.Client;
import com.usuarios.crud.cal.repositories.ClientRepository;
import com.usuarios.crud.cal.service.exceptions.DataBaseException;
import com.usuarios.crud.cal.service.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository rep;
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Client client = rep.findById(id).orElseThrow(() -> new ResourceNotFoundException("Cliente não encontrado!"));
		return new ClientDTO(client);
		
	}
	
	@Transactional(readOnly = true)
	public Page<ClientDTO> findAll(Pageable pageable) {
		Page<Client> result = rep.findAll(pageable);
		return result.map(x -> new ClientDTO(x));
		
	}
	
	@Transactional
	public ClientDTO insert(ClientDTO dto) {
		
		Client entity = new Client();
		dtoToEntity(dto, entity);
		entity = rep.save(entity); // salvar
		return new ClientDTO(entity);
	}
	
	@Transactional
	public ClientDTO update(Long id, ClientDTO dto) { // vai receber o id e o corpo
		try {
		Client entity = rep.getReferenceById(id); // aqui n vai no banco de dados, eh monitorado pela JPA	
	    dtoToEntity(dto, entity);
		entity = rep.save(entity); 
		return new ClientDTO(entity);
		}
		catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Cliente não encontrado!");
		}
	}
	
	@Transactional(propagation = Propagation.SUPPORTS)
	public void delete(Long id) {
		if (!rep.existsById(id)) {
			throw new ResourceNotFoundException("Recurso não encontrado");
		}
		try {
	        	rep.deleteById(id);    		
		}
	    	catch (DataIntegrityViolationException e) { // caso tente deletar algo que esteja atrelado a outra coisa, ex: produto e pedido
	        	throw new DataBaseException("Falha de integridade referencial");
	   	}
	}
	
	private void dtoToEntity(ClientDTO dto, Client entity) {
		entity.setName(dto.getName());
		entity.setCpf(dto.getCpf());
		entity.setIncome(dto.getIncome());
		entity.setBirthDate(dto.getBirthDate());
		entity.setChildren(dto.getChildren());
	}
}
