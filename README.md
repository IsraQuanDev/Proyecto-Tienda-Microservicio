# Proyecto de Microservicios con Spring Boot

Este proyecto implementa una arquitectura de microservicios en **Java Spring Boot** con **Eureka Server**, **API Gateway** y múltiples microservicios relacionados con empleados, productos y tiendas.

## Tecnologías Utilizadas
- **Java 21**
- **Spring Boot 3**
- **Spring Cloud Netflix Eureka** (Discovery Server & Client)
- **Spring Cloud Gateway**
- **Spring Data JPA**
- **Lombok**
- **Base de datos relacional (Oracle)**
- **Feign Client** (para la comunicación entre microservicios)

---

## Estructura del Proyecto

### 1. **API Gateway** (`com.mx.ApiGateway`)
Este servicio actúa como punto de entrada a los microservicios, manejando el enrutamiento de las solicitudes.

### 2. **Eureka Server** (`com.mx.EurekaServer`)
Servidor de descubrimiento de servicios basado en **Netflix Eureka**.

### 3. **Microservicio de Empleados** (`com.mx.MsEmpleados`)
Gestiona los empleados de las tiendas.
- **Modelo:** `Empleados`
- **Base de datos:** `EMPLEADOS_30`
- **Endpoints:**
  - `GET /empleados` - Lista todos los empleados
  - `POST /empleados` - Guarda un nuevo empleado

### 4. **Microservicio de Productos** (`com.mx.MsProductos`)
Gestiona los productos de las tiendas.
- **Modelo:** `Productos`
- **Base de datos:** `PRODUCTOS_30`
- **Endpoints:**
  - `GET /ProductosWs` - Lista todos los productos
  - `POST /ProductosWs` - Guarda un nuevo producto
  - `GET /ProductosWs/tienda/{idTienda}` - Lista productos por tienda

### 5. **Microservicio de Tiendas** (`com.mx.Tienda`)
Gestiona las tiendas y la relación con productos y empleados.
- **Modelo:** `Tiendas`
- **Base de datos:** `TIENDA_30`
- **Feign Client:** Se conecta con `MsProductos`
- **Endpoints:**
  - `GET /TiendasWs` - Lista todas las tiendas
  - `POST /TiendasWs` - Guarda una nueva tienda
  - `GET /TiendasWs/productos/{idTienda}` - Obtiene productos por tienda
  - `POST /TiendasWs/guardarProdu` - Guarda un producto en una tienda

---

## Instalación y Ejecución
### Prerrequisitos
- Tener **Java 21** y **Maven** instalados
- Configurar una base de datos **MySQL** con las tablas necesarias
- Tener **Eureka Server** corriendo antes de iniciar los microservicios

### Pasos para la ejecución
1. **Clonar el repositorio:**
   ```sh
   git clone https://github.com/usuario/microservicios-spring-boot.git
   cd microservicios-spring-boot
   ```
2. **Levantar los servicios en el siguiente orden:**
   ```sh
   # 1. Iniciar Eureka Server
   cd EurekaServer
   mvn spring-boot:run

   # 2. Iniciar API Gateway
   cd ../ApiGateway
   mvn spring-boot:run

   # 3. Iniciar Microservicio de Empleados
   cd ../MsEmpleados
   mvn spring-boot:run

   # 4. Iniciar Microservicio de Productos
   cd ../MsProductos
   mvn spring-boot:run

   # 5. Iniciar Microservicio de Tienda
   cd ../Tienda
   mvn spring-boot:run
   ```

---

## Endpoints y Pruebas
Una vez levantados los servicios, puedes probar los endpoints utilizando **Postman** o **cURL**.

Ejemplo para listar productos:
```sh
curl -X GET http://localhost:8031/ProductosWs
```

Para más pruebas, consulta la sección de **endpoints** en cada microservicio.

 
---

**© 2024 - Microservicios con Spring Boot**

