/**
 * 
 */
package com.aiglesiasp.springrest.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author aitor
 *
 */
@Entity
@Table(name = "empleado")
public class Empleado {

	// Atributos de entidad empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "trabajo")
	private String trabajo;
	@Column(name = "salario")
	private double salario;

	// CONSTRUCTORES
	public Empleado() {

	}

	public Empleado(String nombre, String trabajo, Double salario) {
		this.nombre = nombre;
		this.trabajo = trabajo;

	}

	// GETTERS y SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
		this.salario = generarSalario(trabajo);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario + "]";
	}

	// METODO PARA GENERAR SALARIO
	private double generarSalario(String trabajo) {
		double salario = 0.0;
		switch (trabajo) {
		case "Senior":
			salario = 40000;
			break;
		case "Junior":
			salario = 25000;
			break;
		case "Becario":
			salario = 20000;
			break;
		case "Diseño":
			salario = 30000;
			break;
		case "Jefe":
			salario = 50000;
			break;
		default:
			salario = 0;
			break;
		}
		return salario;
	}

}
