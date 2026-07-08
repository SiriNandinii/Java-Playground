package oopsdemo1;

/**
* Author : sirin
* Date : Jul 6, 2026
* Time : 4:53:19 PM
* Email : sirinandini.a@gmail.com
*/

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.inputEmployeeDetails();
		e1.calculateNetSalary();
		e1.displayEmployeeDetails();
		
		e2.inputEmployeeDetails();
		e2.calculateNetSalary();
		e2.displayEmployeeDetails();
		
		e3.inputEmployeeDetails();
		e3.calculateNetSalary();
		e3.displayEmployeeDetails();
		
	}

}
