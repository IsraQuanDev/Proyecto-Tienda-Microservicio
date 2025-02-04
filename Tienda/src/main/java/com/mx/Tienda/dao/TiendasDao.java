package com.mx.Tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Tienda.entity.Tiendas;

public interface TiendasDao extends JpaRepository<Tiendas,Long> {

}
