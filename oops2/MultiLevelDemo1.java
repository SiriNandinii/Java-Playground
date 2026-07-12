package oopsdemo2;

/**
* Author : sirin
* Date : Jul 7, 2026
* Time : 4:19:54 PM
* Email : sirinandini.a@gmail.com
*/

public class MultiLevelDemo1 {
	
	public static void main(String[] args) {
		
		Director d1 = new Director(101, "Keane", 5000);
		
		System.out.println(" ********** Director Details ********** ");
		d1.display();
		d1.getHRA();
		d1.getDA();
		d1.getTA();
		d1.getGross();
		
		
		Manager m1 = new Manager(201, "Mary",4000);
		System.out.println(" ********** Manager Details ********** ");
		m1.display();
		m1.getHRA();
		m1.getDA();
		m1.getGross();
		
		
		
		Staff s1 = new Staff(301, "Siri", 5000);
		System.out.println(" ********** Staff Details ********** ");

		
	}

}
