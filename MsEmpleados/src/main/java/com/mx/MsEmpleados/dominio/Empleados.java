package com.mx.MsEmpleados.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="EMPLEADOS_30")
@Data
public class Empleados {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long idEmpleado;
	private String nombre;
	private String app;
	private Long idTienda; 
	
	
}
