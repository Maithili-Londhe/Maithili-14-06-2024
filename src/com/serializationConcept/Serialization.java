package com.serializationConcept;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException 
	{		
		
		BufferedReader br = null;
		
		FileOutputStream output = null;
		ObjectOutputStream objectOutputStream = null;
		
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
			
			
			//Employee object
			Employee employee = new Employee(id, name, role, salary);//employee object
			
			output = new FileOutputStream("C:\\Java Development\\employeeObjects.txt");
			objectOutputStream = new ObjectOutputStream(output);			
			objectOutputStream.writeObject(employee);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			br.close();
			objectOutputStream.close();
			output.close();
		}
	}

}
