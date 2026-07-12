package oopsdemo2;

/**
 * Author : sirin
 * Date : Jul 7, 2026
 * Time : 3:13:29 PM
 * Email : sirinandini.a@gmail.com
 */

public class Employee {

	private int empId;
	private String name;


	// Constructor
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}


	void display()
	{
		System.out.println(" ******** Employee Details ******** ");
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name: "+name);
	}




}
