package com.serializationConcept;

import java.io.Serializable;


//step-1: class should implements Serializable interface from java.io package
public class Employee implements Serializable
{
	
	
	private static final long serialVersionUID = 1890L;
	
	private int employeeId;
	private String employeeName;
	private String employeeRole;
	private double employeeSalary;//field will not serialize
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, String employeeRole, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() 
	{
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeRole="
				+ employeeRole + ", employeeSalary=" + employeeSalary + "]";
	}	

}
