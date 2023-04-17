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

	// ENUMERADO DE TRABAJOS
	enum Trabajos {

		SENIOR("senior", 40000), JUNIOR("junior", 25000), BECARIO("becario", 20000), DISEÑO("diseño", 30000),
		JEFE("jefe", 50000);

		private String trabajo;
		private int salario;

		private Trabajos(String trabajo, int salario) {
			this.trabajo = trabajo;
			this.salario = salario;
		}

		public int getSalario() {
			return salario;
		}

		public String getTrabajo() {
			return trabajo;
		}
	};

	// Atributos de entidad empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "trabajo")
	private String trabajo;
	@Column(name = "salario")
	private int salario;

	// CONSTRUCTORES
	public Empleado() {

	}

	public Empleado(String nombre, String trabajo) {
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.salario = generarSalario(trabajo);

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
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario + "]";
	}

	// METODO PARA GENERAR SALARIO
	private int generarSalario(String trabajo) {
		int salario = 0;
		switch (trabajo.toUpperCase()) {
		case "SENIOR":
			salario = 40000;
			break;
		case "JUNIOR":
			salario = 25000;
			break;
		case "BECARIO":
			salario = 20000;
			break;
		case "DISEÑO":
			salario = 30000;
			break;
		case "JEFE":
			salario = 50000;
			break;
		default:
			salario = 0;
			break;
		}
		return salario;
	}

}
