package com.mx.MsProductos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.MsProductos.dao.ProductosDao;
import com.mx.MsProductos.model.Productos;

@Service
public class ProductoServImp {

	
	// metodo para listar
	// metodo para guardar
	// metodo para buscarXidTienda, hacerlo con peticion get, se 
	// se va enviar la información en la url
	
	@Autowired
    private ProductosDao productosDao;

	@Transactional(readOnly=true)
    // Listar todos los productos
    public List<Productos> listar() {
        return productosDao.findAll();
    }

    // Guardar un producto
	@Transactional
    public Productos guardar(Productos producto) {
        return productosDao.save(producto);
    }

    // Buscar productos por ID_TIENDA
	@Transactional(readOnly=true)
    public List<Productos> buscarXtiendaId(Long idTienda) {
        return productosDao.findByIdTienda(idTienda);
    }
	
}
