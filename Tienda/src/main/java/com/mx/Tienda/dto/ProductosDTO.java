package com.mx.Tienda.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// DTO ---- SIRVE PARA TRANSPORTAR DATOS DEL OBJETO 

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class ProductosDTO {

	private Long idProducto;
	private String nombre;
	private Float precio;
	private Long idTienda;
	
	
}
