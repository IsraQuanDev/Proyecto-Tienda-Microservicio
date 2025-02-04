package com.mx.MsProductos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.MsProductos.model.Productos;
import com.mx.MsProductos.service.ProductoServImp;

@RestController
@RequestMapping(path="ProductosWs")
@CrossOrigin
public class ProductosWs {

	@Autowired
	ProductoServImp productoSevImp;
	

	//http://localhost:8031/ProductosWs
	
	@GetMapping
	public List<Productos> listar(){
		
		return productoSevImp.listar();
	}
	
	@PostMapping 
	public ResponseEntity<Productos> guardar(@RequestBody Productos producto){
		return new ResponseEntity<>(productoSevImp.guardar(producto),HttpStatus.CREATED);
		
	}

	//http://localhost:8031/ProductosWs/tienda/1
	@GetMapping(path="/tienda/{idTienda}")
	public List<Productos> buscarXidTienda(@PathVariable("idTienda") Long idTienda){
		return productoSevImp.buscarXtiendaId(idTienda);
	}
	
}
