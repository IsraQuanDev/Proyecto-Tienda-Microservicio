package com.mx.MsProductos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // Anotacion para descubrir las instancias de servicios eureka 
public class MsProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProductosApplication.class, args);
	}

}
