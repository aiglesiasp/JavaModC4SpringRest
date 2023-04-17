/**
 * 
 */
package com.aiglesiasp.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiglesiasp.springrest.dao.IEmpleadoDAO;
import com.aiglesiasp.springrest.dto.Empleado;

/**
 * @author aitor
 *
 */
@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;

	@Override
	public List<Empleado> listarEmpleados() {
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado listarEmpleadoId(Long id) {
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public List<Empleado> listarEmpleadoNombre(String nombre) {
		return iEmpleadoDAO.findByNombre(nombre);
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		iEmpleadoDAO.deleteById(id);
		
	}

}
