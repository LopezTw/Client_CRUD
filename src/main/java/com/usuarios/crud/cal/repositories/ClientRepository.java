package com.usuarios.crud.cal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.usuarios.crud.cal.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
