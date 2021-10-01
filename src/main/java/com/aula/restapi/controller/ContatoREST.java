package com.aula.restapi.controller;

import java.util.List;

import com.aula.restapi.database.RepositorioContato;
import com.aula.restapi.model.Contato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//servidor rest responsavel por manipular o banco de dados
@RequestMapping("/contato")
@RestController
public class ContatoREST {

	@Autowired
	private RepositorioContato repositorioContato;

	// CONSULTAR
	@GetMapping
	public List<Contato> listar() {
		return repositorioContato.findAll();
	}

	// SALVAR
	@PostMapping
	public void salvar(@RequestBody Contato contato) {
		repositorioContato.save(contato);
	}

	// ALTERAR
	@PutMapping
	public void alterar(@RequestBody Contato contato) {
		if (contato.getId() > 0) {

			repositorioContato.save(contato);
		}
	}

	// DELETAR
	@DeleteMapping
	public void deletar(@RequestBody Contato contato) {
		repositorioContato.delete(contato);
	}
}
