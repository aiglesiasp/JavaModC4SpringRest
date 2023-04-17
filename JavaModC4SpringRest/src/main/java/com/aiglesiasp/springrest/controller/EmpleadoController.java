/**
 * 
 */
package com.aiglesiasp.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiglesiasp.springrest.dto.Empleado;
import com.aiglesiasp.springrest.service.EmpleadoServiceImpl;

/**
 * @author aitor
 *
 */
@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;

	// LISTAR TODOS LOS EMPLEADOS
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados() {
		return empleadoServiceImpl.listarEmpleados();
	}

	// GUARDAR EMPLEADOS
	@PostMapping("/empleados")
	public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}

	// BUSCAR EMPLEADO POR ID
	@GetMapping("/empleados/{id}")
	public Empleado listarEmpleadoId(@PathVariable(name = "id") Long id) {
		return empleadoServiceImpl.listarEmpleadoId(id);
	}

	// BUSCAR EMPLEADO POR NOMBRE
	@GetMapping("/empleados/nombre/{nombre}")
	public List<Empleado> listarEmpleadoNombre(@PathVariable(name = "nombre") String nombre) {
		return empleadoServiceImpl.listarEmpleadoNombre(nombre);
	}

	// ACTUALIZAR EMPLEADO
	@PutMapping("/empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name = "id") Long id, @RequestBody Empleado empleado) {
		Empleado empleadoOld = new Empleado();
		Empleado empleadoNew = new Empleado();

		empleadoOld = empleadoServiceImpl.listarEmpleadoId(id);
		empleadoOld.setNombre(empleado.getNombre());
		empleadoOld.setTrabajo(empleado.getTrabajo());
		empleadoOld.setSalario(empleado.getSalario());

		empleadoNew = empleadoServiceImpl.actualizarEmpleado(empleadoOld);
		return empleadoNew;

	}

	// ELIMINAR EMPLEADO
	@DeleteMapping("/empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name = "id") Long id) {
		empleadoServiceImpl.eliminarEmpleado(id);
	}

}
