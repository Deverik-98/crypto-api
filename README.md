# 💰 Crypto API - Plataforma de Compraventa de Criptomonedas

Este proyecto es una API REST construida con **Spring Boot 3**, conectada a una base de datos **PostgreSQL**, para gestionar una plataforma de compra y venta de criptomonedas. Cumple con los requerimientos definidos en la prueba técnica de Banking Technologies Consulting, C.A.

---

## 🚀 Características

- Autenticación segura con JWT
- Registro e inicio de sesión de usuarios
- GET / POST de monedas (`moneda`)
- GET / POST / PUT de criptomonedas (`criptomoneda`)
- Sincronización de datos actuales hacia tablas históricas
- Arquitectura basada en servicios y buenas prácticas

---

## 🧠 Tecnologías utilizadas

- Java 17  
- Spring Boot 3.5  
- Spring Security  
- Spring Data JPA  
- PostgreSQL 14  
- Lombok  
- Maven  

---

## 📦 Instalación

### 1. Clonar el repositorio

```bash
git clone https://github.com/Deverik-98/crypto-api.git
cd crypto-api
```

### 2. Configurar la base de datos

Crea una base de datos llamada `criptodb` en PostgreSQL (puedes usar pgAdmin).  
Asegúrate de que las siguientes tablas existan:

- `usuario`  
- `moneda`  
- `criptomoneda`  
- `historico_moneda`  
- `historico_criptomoneda`  

### 3. Configurar el archivo `src/main/resources/application.properties`

```properties
server.port=8080

spring.datasource.url=jdbc:postgresql://localhost:5432/criptodb
spring.datasource.username=postgres
spring.datasource.password=TU_CONTRASEÑA

spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

jwt.secret=fjh45Dshf3928fhGkjSHF2398skfjhSD2
jwt.expiration=3600000
```

> Asegúrate de usar una clave JWT con al menos 32 caracteres.

### 4. Ejecutar la aplicación

Puedes correr la app desde **STS4** o desde la línea de comandos:

```bash
mvn spring-boot:run
```

---

## 🔐 Endpoints principales

### 📁 Autenticación

- `POST /auth/register` – Registro de usuario  
- `POST /auth/login` – Login, devuelve JWT  

### 💱 Monedas

- `GET /moneda` – Listar monedas  
- `POST /moneda` – Crear nueva moneda  

### 💰 Criptomonedas

- `GET /criptomoneda` – Listar todas  
- `POST /criptomoneda` – Crear nueva criptomoneda  
- `PUT /criptomoneda/{id}` – Actualizar criptomoneda  

### 🔄 Histórico

- `POST /historial/sync` – Mover datos de moneda y criptomoneda hacia históricos  

---

## 🧪 Ejemplos de peticiones

### Login

```http
POST /auth/login
Content-Type: application/json

{
  "correo": "usuario@ejemplo.com",
  "clave": "123456"
}
```

**Respuesta:**

```json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5..."
}
```

### Crear moneda

```http
POST /moneda
Authorization: Bearer {TOKEN}
Content-Type: application/json

{
  "nombre": "Dólar Estadounidense",
  "codigo": "USD"
}
```

---

## 📄 Estructura de paquetes

```
com.crypto.api
├── controllers
├── models.dao
├── models.entity
├── models.services
└── security.config
```

---

## 👤 Autor

Desarrollado por **@Deverik-98** para **Banking Technologies Consulting, C.A.**

📬 ¿Dudas o sugerencias? Abre un *issue* o un *pull request* en el repositorio.
