package oopsdemo2;

/**
* Author : sirin
* Date : Jul 7, 2026
* Time : 3:20:50 PM
* Email : sirinandini.a@gmail.com
*/

public class SingleInheritanceDemo {
	
	public static void main(String[] args) {
		
		Developer d1 = new Developer(101, "James Gosling", "Java", "Airlines");
		Developer d2 = new Developer(202, "Siri Nandini Alanka", "Machine Learning", "House Price Prediction");
		
		d1.display();
		d1.displayDeveloperDetails();
		
		d2.display();
		d2.displayDeveloperDetails();
		
		Employee e1 = new Employee(106, "Mike");
		e1.display();	
	}
}
