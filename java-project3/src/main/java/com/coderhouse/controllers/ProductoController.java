package com.coderhouse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.coderhouse.models.Producto;
import com.coderhouse.repositories.ProductoRepository;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

	
	@Autowired
	private ProductoRepository productoRepository;

	@GetMapping
	public List<Producto> getAllProductos() {
		return productoRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Producto> getProductoById(@PathVariable Long id) {
		if (productoRepository.existsById(id)) {
			Producto producto = productoRepository.findById(id).get();
			return ResponseEntity.ok(producto);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping
	public Producto createProducto(@RequestBody Producto producto) {
		return productoRepository.save(producto);
	}
}