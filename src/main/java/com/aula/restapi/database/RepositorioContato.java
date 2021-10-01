package com.aula.restapi.database;

import com.aula.restapi.model.Contato;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioContato extends JpaRepository<Contato, Long> {

}
