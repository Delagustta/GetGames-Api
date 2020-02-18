package com.getgames.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getgames.api.Entity.Plataforma;

@Repository
public interface PlataformaRepository extends JpaRepository<Plataforma, Integer> {

}
