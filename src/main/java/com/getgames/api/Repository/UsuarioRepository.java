package com.getgames.api.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.getgames.api.Entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	@Query("Select u from Usuario u where u.email=?1 and u.senha=?2")
	Optional<Usuario> getlogin(String email, String senha);
}
