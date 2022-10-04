package com.java.lab01;

public class Employee
{        
	Integer employeeNumber;
	String employeeName;
	String joinDate;
	String department;
	char designationCode;
	double IT;
	double basic;
	double HRA;

	Employee(int employeeNumber, String employeeName , String joinDate, String department,
			char designationCode, double basic, double HRA,double IT)
	{
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.joinDate = joinDate;
        this.department = department;
        this.designationCode = designationCode;
        this.basic = basic;
        this.HRA = HRA;
        this.IT = IT;
    }
	
    public void printData()
    {
    	String printStr = "Employee Number : "+this.employeeNumber+
    			" Employee Name : "+this.employeeName+
    			" Joining Date : "+this.joinDate+
    			" Department Name : "+this.department+
    			" Designation Code : "+this.designationCode+
    			" basic : "+this.basic+
    			" HRA : "+this.HRA+
    			" IT : "+this.IT;
        System.out.println(printStr);
    }
    
    Integer getEmployeeNumber()
    {
    	return this.employeeNumber;
    }

	public String getEmployeeName() {
		return employeeName;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public String getDepartment() {
		return department;
	}

	public char getDesignationCode() {
		return designationCode;
	}

	public double getIT() {
		return IT;
	}

	public double getBasic() {
		return basic;
	}

	public double getHRA() {
		return HRA;
	}
    
 }
