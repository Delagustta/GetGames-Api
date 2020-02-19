package com.getgames.api.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getgames.api.Entity.Usuario;
import com.getgames.api.Service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService service;
	
	@PostMapping
	public ResponseEntity<Usuario> salvar(Usuario usuario) {
		Usuario user = service.salvar(usuario);
		return new ResponseEntity<Usuario>(user, HttpStatus.CREATED);
	}

}
