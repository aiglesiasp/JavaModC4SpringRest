/**
 * 
 */
package com.aiglesiasp.springrest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aiglesiasp.springrest.dto.Empleado;

/**
 * @author aitor
 *
 */
public interface IEmpleadoDAO extends JpaRepository<Empleado, Long> {

	// Listar empleados por campo nombre
	public List<Empleado> findByNombre(String nombre);

}
