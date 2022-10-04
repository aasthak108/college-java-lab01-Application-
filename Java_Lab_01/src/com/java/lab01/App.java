package com.java.lab01;

import java.util.Scanner;

public class App
{
	public static void main(String[] args)
	{
		String ipEmployeeNumberStr = args[0];
		Integer ipEmployeeNumber =
				Integer.parseInt(ipEmployeeNumberStr);
		System.out.println(ipEmployeeNumber);
		
		Employee[] employeeArray = new Employee[7];
		employeeArray[0] =
				new Employee(1001, "Abc", "01/04/2009", "R&D", 'E',20000,8000,3000);
		employeeArray[1] =
				new Employee(1002, "Opqr", "23/08/2012", "PM", 'C', 30000,12000,9000);
		employeeArray[2] =
				new Employee(1003, "Ghi", "12/11/2008", "Acct", 'K', 10000,8000,1000);
		employeeArray[3] = 
				new Employee(1004, "Wxyz", "29/01/2013", "Front Desk", 'R',12000,6000,2000);
		employeeArray[4] = 
				new Employee(1005, "Jklmn", "16/07/2005", "Engg", 'M',50000,20000,20000);
		employeeArray[5] = 
				new Employee(1006, "Stuv", "01/01/2000", "Manufacturing", 'E',23000,9000,4400);
		employeeArray[6] = 
				new Employee(1007, "Def", "12/06/2006", "PM", 'C', 29000,12000,10000);
		
		for(int i=0;i<employeeArray.length;i++)
		{
			if(ipEmployeeNumber == employeeArray[i].getEmployeeNumber().intValue())
			{
				Employee selectedEmployee = employeeArray[i];
				char designationCode = selectedEmployee.getDesignationCode();
				String designation = null;
				Integer DA = null;
				switch(designationCode)
				{
					case 'E':
						designation = "Engineer";
						DA = 20000;
						break;
					
					case 'C':
						designation = "Consultant";
						DA = 32000;
						break;
						
					case 'K':
						designation = "Clerk";
						DA = 12000;
						break;
					
					case 'R':
						designation = "Receptionist";
						DA = 15000;
						break;
						
					case 'M':
						designation = "Manager";
						DA = 40000;
						break;
				}
				Double salary = selectedEmployee.getBasic()
						+ selectedEmployee.getHRA()
						+ DA
						- selectedEmployee.getIT();
				
				String printEmployeeData = "Employee Number : "
						+selectedEmployee.getEmployeeNumber()
						+" Employee Name : "+selectedEmployee.getEmployeeName()
						+" Department : "+selectedEmployee.getDepartment()
						+" Designation : "+designation
						+" Salary : "+salary;
				
				System.out.println(printEmployeeData);
			}
		}
		
	}
}

