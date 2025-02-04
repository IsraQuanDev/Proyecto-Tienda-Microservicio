package com.mx.Tienda.controller;

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

import com.mx.Tienda.dto.ProductosDTO;
import com.mx.Tienda.entity.Tiendas;
import com.mx.Tienda.service.TiendaServImp;

@RestController
@RequestMapping(path="TiendasWs")
@CrossOrigin
public class TiendasWs {
	
	// Aqui tenemos la peticiones propias del MS-TIENDA 

	@Autowired
	TiendaServImp tiendaServImp;
	
	//  htpp://localhost:8030/TiendasWs
	@GetMapping
	public List<Tiendas> listar(){
		return tiendaServImp.listar();
	}

	
	// http://localhost:8030/TiendasWs
	
	@PostMapping
	public ResponseEntity<Tiendas> guardar(@RequestBody Tiendas tienda)
	{
		return new ResponseEntity <Tiendas>(tiendaServImp.guardar(tienda),HttpStatus.CREATED);
	}
	
	
	// AQUI TENEMOS LAS PETICIONES PROPIOS DEL MS-PRODUCTOS 
	
	@PostMapping(path="guardarProdu")
	public ResponseEntity<ProductosDTO> guardarProdu(@RequestBody ProductosDTO producto)
	{
		return new ResponseEntity<ProductosDTO>(tiendaServImp.guardarProducto(producto),HttpStatus.CREATED);	
	}
	
	
	@GetMapping(path ="/productos/{idTienda}")
	public List<ProductosDTO> buscarProductosXidTienda(@PathVariable("idTienda") Long idTienda){
		
		return tiendaServImp.listarProducXidTienda(idTienda);	
	}
	
	
	
	
}
