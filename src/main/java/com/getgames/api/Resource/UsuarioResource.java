package com.getgames.api.Resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getgames.api.Entity.Usuario;
import com.getgames.api.Service.UsuarioService;

@CrossOrigin
@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResource {

	@Autowired
	private UsuarioService service;

	@GetMapping
	public List<Usuario> listarTodos() {
		return service.listar();
	}

	@PostMapping
	public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario) {
		Usuario user = service.salvar(usuario);
		return new ResponseEntity<Usuario>(user, HttpStatus.CREATED);

	}

	@PostMapping("/login")
	public Usuario verificarLogin(@RequestBody @Valid Usuario usuario) {
		return service.buscarLogin(usuario);
	}

}
