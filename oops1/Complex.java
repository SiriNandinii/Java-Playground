package oopsdemo1;

/**
* Author : sirin
* Date : Jul 7, 2026
* Time : 12:39:06 PM
* Email : sirinandini.a@gmail.com
*/

public class Complex {
	
	private int real;
	private int imaginary;
	
	
	// Parameterized Constructor
	
	public Complex(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	
	
	//Methods
	
	public void add(Complex obj) {
		this.real += obj.real;
		this.imaginary += obj.imaginary;
	}
	
	public void display() {
		System.out.println("r"+this.real+" + i"+this.imaginary);
	}
	
	

}
