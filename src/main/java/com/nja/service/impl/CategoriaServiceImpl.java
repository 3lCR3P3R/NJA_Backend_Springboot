package com.nja.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nja.entity.Categoria;
import com.nja.repository.CategoriaRepository;
import com.nja.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public List<Categoria> getCategorias() {
		return this.categoriaRepository.findAll();
	}

	@Override
	public Categoria getCategoria(Integer id) {
		Optional<Categoria> categoria = this.categoriaRepository.findById(id);
		
		if(categoria.isPresent()) {
			return categoria.get();
		} else {
			return new Categoria();
		}
	}

	@Override
	public Categoria addCategoria(Categoria categoria) {
		return this.categoriaRepository.save(categoria);
	}

	@Override
	public Categoria editCategoria(Categoria categoria) {
		return this.categoriaRepository.save(categoria);
	}

}
