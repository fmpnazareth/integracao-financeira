package com.fnazareth.ms_favorecidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fnazareth.ms_favorecidos.entities.Favorecido;

public interface FavorecidoRepository extends JpaRepository<Favorecido, Long> {

}
