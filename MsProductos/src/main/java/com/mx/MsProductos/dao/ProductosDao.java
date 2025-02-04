package com.mx.MsProductos.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.MsProductos.model.Productos;

public interface ProductosDao extends JpaRepository<Productos,Long> {
	
	public List<Productos> findByIdTienda(Long idTienda);
	

}
