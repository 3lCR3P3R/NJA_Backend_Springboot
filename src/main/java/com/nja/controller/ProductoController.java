package com.nja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nja.entity.Producto;
import com.nja.service.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private ProductoService ProductoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Producto> getProductos(){
		return this.ProductoService.getProductos();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Producto getProducto(@PathVariable("id") Integer id){
		return this.ProductoService.getProducto(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "cat/{ct}")
	public List<Producto> getProductosCategoria(@PathVariable("ct") String categoria){
		return this.ProductoService.getProductosCategoria(categoria);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Producto addProducto(@RequestBody Producto producto){
		return this.ProductoService.addProducto(producto);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Producto editProducto(@RequestBody Producto producto){
		return this.ProductoService.editProducto(producto);
	}

}
