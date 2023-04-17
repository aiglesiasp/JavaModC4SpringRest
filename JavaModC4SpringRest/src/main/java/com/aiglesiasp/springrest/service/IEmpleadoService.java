/**
 * 
 */
package com.aiglesiasp.springrest.service;

import java.util.List;

import com.aiglesiasp.springrest.dto.Empleado;

/**
 * @author aitor
 *
 */
public interface IEmpleadoService {

	// METODO CRUD
	public List<Empleado> listarEmpleados(); // Listar All

	public Empleado guardarEmpleado(Empleado empleado); // Guarda un empleado CREATE

	public Empleado listarEmpleadoId(Long id); // Leer datos de un empleado READ

	public List<Empleado> listarEmpleadoNombre(String nombre);// Listar empleados por campo nombre

	public Empleado actualizarEmpleado(Empleado empleado); // Actualiza datos del empleado UPDATE

	public void eliminarEmpleado(Long id);// Elimina el empleado DELETE

}
