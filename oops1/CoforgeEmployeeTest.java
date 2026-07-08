package oopsdemo1;

/**
* Author : sirin
* Date : Jul 6, 2026
* Time : 4:53:19 PM
* Email : sirinandini.a@gmail.com
*/

public class CoforgeEmployeeTest {
	
	public static void main(String[] args) {
		
		Employee developer = new Employee();
		Employee tester = new Employee();
		Employee sales = new Employee();
		
		System.out.println(" ********** Coforge ********** ");
		
		developer.inputEmployeeDetails();
		developer.calculateNetSalary();
		developer.displayEmployeeDetails();
		
		tester.inputEmployeeDetails();
		tester.calculateNetSalary();
		tester.displayEmployeeDetails();
		
		sales.inputEmployeeDetails();
		sales.calculateNetSalary();
		sales.displayEmployeeDetails();
		
	}

}
