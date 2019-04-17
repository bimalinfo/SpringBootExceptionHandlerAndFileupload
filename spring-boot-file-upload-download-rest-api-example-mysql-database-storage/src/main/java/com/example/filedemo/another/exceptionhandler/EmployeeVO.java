package com.example.filedemo.another.exceptionhandler;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.transaction.support.ResourceHolderSupport;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeVO extends ResourceHolderSupport implements Serializable
{
    private static final long serialVersionUID = 1L;
     
    public EmployeeVO(Integer id, String firstName, String lastName, String email) {
        super();
        this.employeeId = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
 
    public EmployeeVO() {
    }
 
    private Integer employeeId;
 
    @NotEmpty(message = "first name must not be empty")
    private String firstName;
 
    @NotEmpty(message = "last name must not be empty")
    private String lastName;
 
    @NotEmpty(message = "email must not be empty")
    @Email(message = "email should be a valid email")
    private String email;
    
    @JsonElement(key="Age should not be invalid")
    private int age;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
     
    
}