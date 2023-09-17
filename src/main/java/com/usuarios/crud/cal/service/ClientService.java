package com.usuarios.crud.cal.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.usuarios.crud.cal.dto.ClientDTO;
import com.usuarios.crud.cal.entities.Client;
import com.usuarios.crud.cal.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository rep;
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> result = rep.findById(id);
		Client client = result.get();
		ClientDTO dto = new ClientDTO(client);
		return dto;
		
	}
	
	
}
