package com.nja.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nja.entity.Producto;
import com.nja.entity.Usuario;

@Service
public interface ProductoService {

	List<Producto> getProductos();
	Producto getProducto(Integer id);
	List<Producto> getProductosCategoria(String categoria);
	List<Producto> getProductosUsuario(Usuario usuario);
	Producto getProductoIdUsuario(Integer id, Usuario usuario);
	Producto addProducto(Producto producto);
	Producto editProducto(Producto producto);
}
