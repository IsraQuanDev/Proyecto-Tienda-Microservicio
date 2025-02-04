package com.mx.MsProductos.model;

import jakarta.persistence.*;  // Importa todas las anotaciones de JPA
import lombok.Data;

/*
 CREATE TABLE PRODUCTOS_30(
ID_PRODUCTO NUMBER PRIMARY KEY, 
NOMBRE VARCHAR2(100) NOT NULL,
PRECIO NUMBER NOT NULL,
ID_TIENDA NUMBER NOT NULL --- LLAVE REFERENCIADA

); 
 * */

@Entity
@Table(name="PRODUCTOS_30")
@Data
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Si la DB genera el ID automáticamente
    @Column(name="ID_PRODUCTO")
    private Long idProducto;
    
    @Column(name="NOMBRE")
    private String nombre;
    
    @Column(name="PRECIO")
    private Float precio;

    @Column(name="ID_TIENDA")
    private Long idTienda; // Cambiado a Long si es una clave foránea
    
}
