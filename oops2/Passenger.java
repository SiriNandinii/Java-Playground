package oopsdemo2;

/**
 * Author : sirin
 * Date : Jul 7, 2026
 * Time : 3:54:18 PM
 * Email : sirinandini.a@gmail.com
 */

public class Passenger {

	// Declaration
	private String name;
	private int age;
	private String passportNumber;

	
	
	// Constructor
	public Passenger(String name, int age, String passportNumber) {
		super();
		this.name = name;
		this.age = age;
		this.passportNumber = passportNumber;
	}

	
	
	
	//Methods
	public void displayPassengerInfo() {
		System.out.println("Passenger Name: " + name);
		System.out.println("Passenger Age: " + age);
		System.out.println("Passport Number: " + passportNumber);
	}




}
