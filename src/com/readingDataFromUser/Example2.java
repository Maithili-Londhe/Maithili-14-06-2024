package com.readingDataFromUser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {

	public static void main(String[] args) throws IOException 
	{		
		
		BufferedReader br = null;
		
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter employee id: ");
			int id = Integer.parseInt(br.readLine());
			
			System.out.println("Enter employee name: ");
			String name = br.readLine();
			
			System.out.println("Enter employee role: ");
			String role = br.readLine();
			
			System.out.println("Enter employee salary: ");
			double salary = Double.parseDouble(br.readLine());
			
			
			Employee employee = new Employee(id, name, role, salary);//employee object
			
			System.out.println(employee.toString());//print object data
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			br.close();
		}
	}

}
