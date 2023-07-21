package com.gqt.launch;

import com.gqt.entities.Account;
import com.gqt.entities.Employee;

public class Launch {

	public static void main(String[] args) {
		
		Account a = new Account(415417,"Savings","UR");
		Employee emp = new Employee(1517,"UR","TPT", a);
		
		emp.disp();
		

	}

}
