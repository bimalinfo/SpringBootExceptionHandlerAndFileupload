package com.example.filedemo.another.exceptionhandler;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeRESTController {
	
	@GetMapping(value="/welcome")
	public String welcomeEmployee(){
		return "Welcome";
		
	}

	@PostMapping(value = "/employees")
	public ResponseEntity<EmployeeVO> addEmployee (@Valid @RequestBody EmployeeVO employee)
	{
		System.out.println("employee.getAge(): "+employee.getAge());
		if(employee.getAge()>100) {
	         throw new AgeInvalidException("Age should be < 100:"+employee.getAge());
	    }
		
	    EmployeeDB.addEmployee(employee);
	    return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
	}
	 
	@GetMapping(value = "/employees/{id}")
	public ResponseEntity<EmployeeVO> getEmployeeById (@PathVariable("id") int id)
	{
	    EmployeeVO employee = EmployeeDB.getEmployeeById(id);
	     
	    if(employee == null) {
	         throw new RecordNotFoundException("Invalid employee id : " + id);
	    }
	    
	    if(employee.getAge()>100) {
	         throw new AgeInvalidException("Age should be < 100:"+employee.getAge());
	    }
	    return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
	}
}
