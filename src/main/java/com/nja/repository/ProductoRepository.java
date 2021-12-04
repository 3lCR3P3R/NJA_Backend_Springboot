package com.nja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nja.entity.Producto;
import com.nja.entity.Usuario;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	
	List<Producto> getByCategoria(String categoria);
	List<Producto> getByUsuario(Usuario usuario);
	Producto getByIdAndUsuario(Integer id, Usuario usuario);
}
