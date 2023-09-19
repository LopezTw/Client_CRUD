package com.usuarios.crud.cal.dto;

import java.time.LocalDate;

import com.usuarios.crud.cal.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class ClientDTO {
	
	private Long id;
	
	@Size(min = 3, max = 80, message = "Nome precisa ter de 3 a 80 caracteres")
	@NotBlank(message = "Campo Obrigatório")
	private String name;

	
	@Size(min = 11, max = 14, message = "CPF precisa ter 11 digitos")
	@NotBlank(message = "Campo Obrigatório")
	private String cpf;
	
	@Positive(message = "O valor deve ser Positivo!")
	private Double income;
	
	@PastOrPresent(message = "Datas futuras não são aceitas!")
	private LocalDate birthDate;
	
	@PositiveOrZero
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
