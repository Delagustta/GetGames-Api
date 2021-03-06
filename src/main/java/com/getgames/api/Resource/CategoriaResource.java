package com.getgames.api.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getgames.api.Entity.Categoria;
import com.getgames.api.Service.CategoriaService;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaResource {

	@Autowired
	private CategoriaService service;

	@GetMapping
	public List<Categoria> getAll() {
		return service.findAll();
	}

}
