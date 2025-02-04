package com.mx.Tienda.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import com.mx.Tienda.dao.TiendasDao;
import com.mx.Tienda.dto.ProductosDTO;
import com.mx.Tienda.entity.Tiendas;
import com.mx.Tienda.feingClient.IProductosFeingClient;

@Service
public class TiendaServImp {
	
	// METODOS PROPIOS DEL MS-TIENDA O PADRE 
	
	
	

	@Autowired
	TiendasDao tiendaDao;
	
	@Transactional(readOnly = true)
	public List<Tiendas> listar(){
		return tiendaDao.findAll();
	}
	
	@Transactional 
	public Tiendas guardar(Tiendas tienda) {
		return tiendaDao.save(tienda);
	}
	
	
	
	// 1--- AQUI VAMOS A PROBAR QUE FUNCIONE NUESTRA COMUNICACION DE OPEN_FEING_CLIENTE
		// METODOS PROPIOS DEL MS-PRODUCTOS
		
	
	@Autowired
	IProductosFeingClient iProductosFeingClient;
	public ProductosDTO guardarProducto(ProductosDTO producto)
	{
		return iProductosFeingClient.guardar(producto);
	}
	
	// 2--- aqui vamos a probar que funcione nuestra comunicacion con restemplate
	
	// http://localhost:8030/TiendasWs/guardarProdu
	
	@Autowired
	RestTemplate restTemplate;
	
	@Transactional(readOnly=true)
	public List<ProductosDTO> listarProducXidTienda(Long idTienda)
	{
		@SuppressWarnings("unchecked")
		List<ProductosDTO> listaNueva = restTemplate.getForObject("http://localhost:8031/ProductosWs/tienda/"+idTienda,List.class);
				return listaNueva;
	}
	
	
	
	
	
	
	
	
	
	
}
