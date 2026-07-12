package oopsdemo3;

/**
 * Author : sirin
 * Date : Jul 8, 2026
 * Time : 11:39:19 AM
 * Email : sirinandini.a@gmail.com
 */


class Bank{

	private String name;

	public Bank(String name) {
		this.name = name;
	}

	int getRateOfInterest(){
		return 0;
	}

	void display(){
		System.out.println("Welcome to "+name+" Bank");
	}
}



// SBI Child class

class SBI extends Bank {

	public SBI(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() {
		return 5;
	}
}



// ICICI Child class

class ICICI extends Bank{

	public ICICI(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() {
		return 7;
	}


}



// Axis Bank Child class

class Axis extends Bank{
	
	public Axis(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() {
		return 6;
	}
}



// Main class

public class OverrideDemo {

	public static void main(String[] args) {
		
		
		SBI sbi = new SBI("SBI");
		ICICI icici = new ICICI("ICICI");
		Axis axis = new Axis("Axis");
		
		sbi.display();
		System.out.println("The Interest Rate of SBI is : "+sbi.getRateOfInterest());
		
		icici.display();
		System.out.println("The Interest Rate of ICICI is : "+icici.getRateOfInterest());
		
		axis.display();
		System.out.println("The Interest Rate of Axis is : "+axis.getRateOfInterest());


	}

}
