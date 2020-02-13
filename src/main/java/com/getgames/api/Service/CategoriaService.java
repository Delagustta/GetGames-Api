package com.getgames.api.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getgames.api.Entity.Categoria;
import com.getgames.api.Repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	
	public List<Categoria> findAll() {
		return categoriaRepository.findAll();
	}
	
}
