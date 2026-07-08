package oopsdemo1;

/**
 * Author : sirin
 * Date : Jul 7, 2026
 * Time : 11:52:35 AM
 * Email : sirinandini.a@gmail.com
 */

class Pen{

	// Properties/attributes of Pen
	private String color;
	private String type;
	
	

	Pen(){
		System.out.println("I am No-Args Constructor");
		this.color = "Red";
		this.type = "Fountain";
	}

	Pen(String color, String type){
		System.out.println("I am parameterized Constructor");
		this.color = color;
		this.type = type;				
	}


	void display() {

		System.out.println("Pen color : "+this.color+", Pen Type : "+this.type);

	}

}


public class ConstructorTest{
	public static void main(String[] args) {
		
		Pen pen1 = new Pen();						// invokes no-args constructor
		Pen pen2 = new Pen("Blue", "Ballpoint");    // invokes parameterized constructor
		Pen pen3 = new Pen("Black", "Gel");			// invokes parameterized constructor
		Pen pen4 = new Pen();						// invokes no-args constructor
		
		pen1.display();
		pen2.display();
		pen3.display();
		

	}
}


