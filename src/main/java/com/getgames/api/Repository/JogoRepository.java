package com.getgames.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getgames.api.Entity.Jogo;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Integer> {

}
