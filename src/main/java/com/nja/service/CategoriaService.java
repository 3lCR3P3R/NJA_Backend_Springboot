package com.nja.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nja.entity.Categoria;

@Service
public interface CategoriaService {

	List<Categoria> getCategorias();
	Categoria getCategoria(Integer id);
	Categoria addCategoria(Categoria categoria);
	Categoria editCategoria(Categoria categoria);
}
