package com.mx.Tienda.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/*
 CREATE TABLE TIENDA_30(
ID_TIENDA NUMBER PRIMARY KEY,
NOMBRE VARCHAR2(100) NOT NULL,
TIPO VARCHAR2(100) NOT NULL
);
 * */

@Entity
@Table(name="TIENDA_30")
@Data
public class Tiendas {

	
	@Id
	@Column(name="ID_TIENDA")
	private Long idTienda;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="TIPO")
	private String tipo;
	
	
}
