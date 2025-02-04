package com.mx.Tienda.feingClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mx.Tienda.dto.ProductosDTO;

//FeignClent: este recibe parametros para realizar la comunicacion ms
// nombre-ms, urlServidorlocal-MS, pathClase-ms

@FeignClient(name="MS-PRODUCTOS",url="http://localhost:8031",path="/ProductosWs")
public interface IProductosFeingClient {
	
	@PostMapping
	public abstract ProductosDTO guardar(@RequestBody ProductosDTO producto);
	
	
	

}
