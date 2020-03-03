package com.getgames.api.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getgames.api.Entity.Usuario;
import com.getgames.api.Repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	

	public Usuario salvar(Usuario usuario) {
		return repository.save(usuario);
	}

	public List<Usuario> listar() {
		return repository.findAll();
	}

	public Usuario buscarLogin(Usuario usuario) {

		Optional<Usuario> opt = repository.getlogin(usuario.getEmail(), usuario.getSenha());
		return opt.get();
	}

	public Usuario buscarPorId(Integer id) {
		return repository.findById(id).get();
	}

}
