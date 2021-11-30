package com.nja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nja.entity.Categoria;
import com.nja.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> getCategorias() {
		return this.categoriaService.getCategorias();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Categoria getCategoria(@PathVariable("id") Integer id) {
		return this.categoriaService.getCategoria(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Categoria addCategoria(@RequestBody Categoria categoria) {
		return this.categoriaService.addCategoria(categoria);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Categoria editCategoria(@RequestBody Categoria categoria) {
		return this.categoriaService.editCategoria(categoria);
	}

}
