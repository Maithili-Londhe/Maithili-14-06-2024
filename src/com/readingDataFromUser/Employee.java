package com.readingDataFromUser;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String employeeRole;
	private double employeeSalary;
	
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
