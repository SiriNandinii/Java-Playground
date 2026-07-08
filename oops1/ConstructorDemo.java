package oopsdemo1;

/**
 * Author : sirin
 * Date : Jul 7, 2026
 * Time : 12:08:46 PM
 * Email : sirinandini.a@gmail.com
 */

public class ConstructorDemo {

	private int id;
	private String name;
	private float salary;



	// Generate Constructor without arguments/implicit Constructor	
	public ConstructorDemo() {
		System.out.println("I am Implicit Constructor");
		this.id = 101;
		this.name = "Alice";
		this.salary = 7000.00f;
	}


	// Generate Constructor with arguments
	public ConstructorDemo(int id, String name, float salary) {
		System.out.println("I am Parameterized Constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	void display() {
		System.out.println(this.id+ " "+this.name+" "+this.salary);
	}


	public static void main(String[] args) {
		
		ConstructorDemo cd1=new ConstructorDemo(); // invokes implicit Constructor
		ConstructorDemo cd2=new ConstructorDemo(102,"John",6000.00f); // invoke parameterized constructor
		ConstructorDemo cd3=new ConstructorDemo(103,"Gavin",5000.00f); // invoke parameterized constructor

		ConstructorDemo cd4=new ConstructorDemo();
		ConstructorDemo cd5=new ConstructorDemo();

		cd1.display();
		cd2.display();
		cd3.display();
	}
}
