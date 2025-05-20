# SpringReactiveApp
This repo is to build a SpringReactiveApp

To create Spring Reactive App we need to follow some steps, like adding the proper dependencies for the MYSQL DB

		<!-- this is web dependency for Spring Reactive -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-webflux</artifactId>
		</dependency>

		<!-- this is JPA dependency for Spring Reactive -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-r2dbc</artifactId>
		</dependency>

		<!-- this is MYSQL connector dependency for Spring Reactive -->
		<dependency>
			<groupId>io.asyncer</groupId>
			<artifactId>r2dbc-mysql</artifactId>
			<scope>runtime</scope>
		</dependency>


application.property file configuration will be like this 

server.port=9090
#jdbc:mysql://localhost:3307/database
spring.r2dbc.url=r2dbc:mysql://localhost:3306/etpl_tut
spring.r2dbc.username=root
spring.r2dbc.password=Virendra@123


**:: When we use Spring Reactive at that time our JPA not auto create table we need to create manualy for above project this is sql query need to create table manualy in DB
CREATE TABLE IF NOT EXISTS users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    contact BIGINT
);
 
