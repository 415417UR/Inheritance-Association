package com.gqt.entities1;

public class Employee {

	private int empId;
	private String empName;
	private String empAdrr;
	private Account acc;
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpAdrr(String empAdrr) {
		this.empAdrr = empAdrr;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	public String toString() {
		return "Employee Details: "+'\n'+
				empId+'\n'+
				empName+'\n'+
				empAdrr+'\n'+
				'\n'+
				"Account Deatils"+'\n'+
				acc.getAccName()+'\n'+
				acc.getAccNo()+'\n'+
				acc.getAccType();
	}
}
