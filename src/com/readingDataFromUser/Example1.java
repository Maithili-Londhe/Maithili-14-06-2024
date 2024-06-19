package com.readingDataFromUser;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter employee id: ");
		int id = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter employee name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter employee role: ");
		String role = scanner.nextLine();
		
		System.out.println("Enter employee salary: ");
		double salary = scanner.nextDouble();
		
		scanner.close();
		
		Employee employee = new Employee(id, name, role, salary);
		
		System.out.println(employee.toString());
		
	}

}
