package com.nja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nja.entity.Producto;
import com.nja.entity.Usuario;
import com.nja.service.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	private ProductoService ProductoService;

	@RequestMapping(method = RequestMethod.GET, value = "/sf")
	public List<Producto> getProductos() {
		return this.ProductoService.getProductos();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/sf/{id}")
	public Producto getProducto(@PathVariable("id") Integer id) {
		return this.ProductoService.getProducto(id);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/sf/categoria/{ct}")
	public List<Producto> getProductosCategoria(@PathVariable("ct") String categoria) {
		return this.ProductoService.getProductosCategoria(categoria);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/cf/usuario")
	public List<Producto> getProductosUsuario(@RequestBody Usuario usuario) {
		return this.ProductoService.getProductosUsuario(usuario);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/cf/{id}/usuario")
	public Producto getProductoIdUsuario(@PathVariable("id") Integer id, @RequestBody Usuario usuario) {
		Producto producto = this.ProductoService.getProductoIdUsuario(id, usuario);
		
		if (producto != null) {
			return producto;
		}
		
		return new Producto();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/cf")
	public Producto addProducto(@RequestBody Producto producto) {
		return this.ProductoService.addProducto(producto);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/cf")
	public Producto editProducto(@RequestBody Producto producto) {
		return this.ProductoService.editProducto(producto);
	}

}
