package com.example.filedemo.another.exceptionhandler;

public class EmployeeDB {
	
	static{
		EmployeeVO empvo=new EmployeeVO();
		empvo.setEmployeeId(1);
		empvo.setFirstName("jhon");
		empvo.setLastName("jhonlast");
		empvo.setEmail("jhon@jhon.com");
	}
	
	public static EmployeeVO addEmployee(EmployeeVO employeeVO){
		return employeeVO;
	}
	public static EmployeeVO getEmployeeById(int id){
		EmployeeVO empvo=null;
		
		if(id==2){
			empvo=new EmployeeVO();
			empvo.setEmployeeId(2);
			empvo.setFirstName("jhon2");
			empvo.setLastName("jhonlast2");
			empvo.setEmail("jhon2@jhon.com");
		}else{
			empvo=new EmployeeVO();
			empvo.setAge(110);
			return empvo;
		}
		
		return empvo;
	}

}
