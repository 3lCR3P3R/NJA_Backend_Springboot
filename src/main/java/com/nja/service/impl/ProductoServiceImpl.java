package com.nja.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nja.entity.Producto;
import com.nja.repository.ProductoRepository;
import com.nja.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public List<Producto> getProductos() {
		return this.productoRepository.findAll();
	}

	@Override
	public Producto getProducto(Integer id) {
		Optional<Producto> producto = this.productoRepository.findById(id);
		
		if(producto.isPresent()) {
			return producto.get();
		} else {
			return new Producto();
		}
	}

	@Override
	public Producto addProducto(Producto producto) {
		return this.productoRepository.save(producto);
	}

	@Override
	public Producto editProducto(Producto producto) {
		return this.productoRepository.save(producto);
	}

}
