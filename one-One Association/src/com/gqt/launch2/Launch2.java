package com.gqt.launch2;

import com.gqt.entities1.Account;
import com.gqt.entities1.Employee;

public class Launch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a = new Account();
		a.setAccNo(415417);
		a.setAccName("UR");
		a.setAccType("savings");
		
		Employee emp = new Employee();
		emp.setEmpId(1517);
		emp.setEmpName("UR");
		emp.setEmpAdrr("TPT");
		
		//performing dependency Injection using Setter
		emp.setAcc(a);
		System.out.println(emp);
	}

}
