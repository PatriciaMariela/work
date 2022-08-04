package com.gestion.empleados.controlador;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.empleados.excepciones.ResourceNotFoundException;
import com.gestion.empleados.modelo.Empleado;
import com.gestion.empleados.repositorio.EmpleadoRepositorio;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200/")
public class EmpleadoControlador {

	@Autowired
	private EmpleadoRepositorio repositorio;
	
	//Lista todo los empleados
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		return repositorio.findAll();
	}
	
	//Guarda empleado
	@PostMapping("/empleados")       //El @RequestBody recibe un empleado en formato JSON
	public Empleado guardarEmpleados(@RequestBody Empleado empleado){
		return repositorio.save(empleado);
	}
	
	//busca empleado por id
	@GetMapping("/empleados/{id}")
	public ResponseEntity<Empleado> obtenerEmpleadoPorId(@PathVariable Long id){
		Empleado empleado = repositorio.findById(id)
							.orElseThrow(() -> new ResourceNotFoundException("No existe el empleado con ID: " + id));
		return ResponseEntity.ok(empleado);
	}
	
	@PutMapping("/empleados/{id}")
	public ResponseEntity<Empleado> actualizarEmpleadoPorId(@PathVariable Long id, @RequestBody Empleado detallesEmpleados){
		Empleado empleado = repositorio.findById(id)
							.orElseThrow(() -> new ResourceNotFoundException("No existe el empleado con ID: " + id));
		
		empleado.setNombre(detallesEmpleados.getNombre());
		empleado.setApellido(detallesEmpleados.getApellido());
		empleado.setEmail(detallesEmpleados.getEmail());
		
		Empleado empleadoActualizado = repositorio.save(empleado);
		
		return ResponseEntity.ok(empleadoActualizado);
	}
	
	//este metodo sirve para eliminar un empleado
		@DeleteMapping("/empleados/{id}")
		public ResponseEntity<Map<String,Boolean>> eliminarEmpleado(@PathVariable Long id){
			Empleado empleado = repositorio.findById(id)
					            .orElseThrow(() -> new ResourceNotFoundException("No existe el empleado con el ID : " + id));
			
			repositorio.delete(empleado);
			Map<String, Boolean> respuesta = new HashMap<>();
			respuesta.put("eliminar",Boolean.TRUE);
			return ResponseEntity.ok(respuesta);
	    }
	
}
