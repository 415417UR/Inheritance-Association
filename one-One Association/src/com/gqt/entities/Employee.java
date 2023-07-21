package com.gqt.entities;

public class Employee {

	private int empId;
	private String empName;
	private String empAdrr;
	private Account acc;
	
	
	public Employee(int empId, String empName, String empAdrr, Account acc) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAdrr = empAdrr;
		this.acc = acc;
	}




	
	public int getEmpId() {
		return empId;
	}


	public String getEmpName() {
		return empName;
	}


	public String getEmpAdrr() {
		return empAdrr;
	}


	public Account getAcc() {
		return acc;
	}


	public void disp() {
		System.out.println("Employee Details: ");
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empAdrr);
		System.out.println("Account Details: ");
		System.out.println(acc.getAccNo());
		System.out.println(acc.getAccType());
		System.out.println(acc.getAccName());
	}
	
}
