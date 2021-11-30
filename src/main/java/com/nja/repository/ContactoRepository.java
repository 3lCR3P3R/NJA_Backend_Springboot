package com.nja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nja.entity.Contacto;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer>{

}
