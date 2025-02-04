package com.mx.Tienda.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
	
	// @Bean: no es mas que una clase que se encarga de realizar una instancia a la clase RestTemplate
	
	// RestTemplate: es una clase de spring que nos indica o ayuda a trabajar con servicios rest --- apirest
	
	
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	

}
