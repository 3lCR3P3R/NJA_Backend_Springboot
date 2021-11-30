package com.nja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nja.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
