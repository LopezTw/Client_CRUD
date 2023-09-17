package com.usuarios.crud.cal.dto;

import java.time.LocalDate;

import com.usuarios.crud.cal.entities.Client;

public class ClientDTO {
	
	private Long id;
	private String name;
	private String cpf;
	private Double income;
	private LocalDate birthDate;
	private Integer children;
	
	public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
	}
	
	// Facilita a chamada no Client Service
	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		income = entity.getIncome();
		birthDate = entity.getBirthDate();
		children = entity.getChildren();
				
	}
	
	// Set's omitidos pois não será feita nenhuma alteração usando eles por aqui
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getIncome() {
		return income;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public Integer getChildren() {
		return children;
	}
	
	
}
