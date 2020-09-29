package com.codecool.crudpractice.employees.controller;


import com.codecool.crudpractice.employees.exception.ResourceNotFoundException;
import com.codecool.crudpractice.employees.model.Employee;
import com.codecool.crudpractice.employees.repository.EmployeeRepository;
import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class EmployeeController {


	private final EmployeeRepository employeeRepository;

	//get employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}



	//get employee by id

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById (@PathVariable(value = "id") Long employeeID) throws ResourceNotFoundException{
		Employee employee = employeeRepository.findById(employeeID).orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id " + employeeID));
		return ResponseEntity.ok().body(employee);
	}


	//save employee
	@PostMapping("/employees/create")
	public Employee createEmployee (@RequestBody Employee employee) {

		return employeeRepository.save(employee);
	}

	//update emlployee
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(name = "id") Long employeeID, @Valid @RequestBody Employee employeeDetails) throws ResourceNotFoundException {

		Employee employee = employeeRepository.findById(employeeID).orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id " + employeeID));
		employee.setEmail(employeeDetails.getEmail());
		employee.setFirstName((employee.getFirstName()));
		employee.setLastName((employeeDetails.getLastName()));

		return ResponseEntity.ok(employeeRepository.save(employee));

	}

	//delete employee
	@DeleteMapping("employees/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable (name = "id") Long employeeID) throws ResourceNotFoundException{
		Employee employee = employeeRepository.findById(employeeID).orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id " + employeeID));

		employeeRepository.delete(employee);
		Map <String, Boolean> response = new HashMap<>();
		response.put("deleted " + employee.getId(), Boolean.TRUE);
		return response;
	}
}
