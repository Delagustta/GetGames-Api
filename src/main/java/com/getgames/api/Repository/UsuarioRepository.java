package com.getgames.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getgames.api.Entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
