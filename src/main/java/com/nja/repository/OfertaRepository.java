package com.nja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nja.entity.Oferta;

@Repository
public interface OfertaRepository extends JpaRepository<Oferta, Integer>{

}
