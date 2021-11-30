package com.nja.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nja.entity.Producto;

@Service
public interface ProductoService {

	List<Producto> getProductos();
	Producto getProducto(Integer id);
	Producto addProducto(Producto producto);
	Producto editProducto(Producto producto);
}
