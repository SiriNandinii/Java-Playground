package oopsdemo2;

/**
 * Author : sirin
 * Date : Jul 8, 2026
 * Time : 9:36:27 AM
 * Email : sirinandini.a@gmail.com
 */

public class Student {

	// properties
	int rollNo;
	String name;
	

	// Entity Reference -Aggregation - has a relationship
	Address ad;
	
		
	//Constructor
	public Student(int rollNo, String name, Address ad) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.ad = ad;
	}


	// Methods
	void display(){
		System.out.println(" ---------- Student Details ------------ ");
		System.out.println("Student Id   :"+rollNo );
		System.out.println("Student Name :"+name);
		System.out.println("Address: "+ad.city+" "+ad.state+" "+ad.country+" "+ad.pincode);
	}

}
