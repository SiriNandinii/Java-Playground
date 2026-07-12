package oopsdemo3;

/**
* Author : sirin
* Date : Jul 8, 2026
* Time : 10:42:48 AM
* Email : sirinandini.a@gmail.com
*/

public class MethodOverloadDemo {
	
	public static void main(String[] args) {
		
		Addition a1 = new Addition();
		
		a1.add();
		a1.add(20,30);
		a1.add(34.75f, 542.67f);
		a1.add("Hello", "World");
	
		
	}

}
