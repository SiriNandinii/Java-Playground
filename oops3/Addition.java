package oopsdemo3;

/**
 * Author : sirin
 * Date : Jul 8, 2026
 * Time : 10:39:56 AM
 * Email : sirinandini.a@gmail.com
 */

public class Addition {

	//  add() method is overloaded
	void add() {
		System.out.println("Method Overloading Demo");
	}

	void add(int a,int b) {
		System.out.println("The Addition of 2 nos is :"+(a+b));
	}

	void add(double a,double b) {
		System.out.println("The Addition of 2 float nos is :"+(a+b));
	}

	void add(int a,int b, int c) {
		System.out.println("The Addition of 3 nos is :"+(a+b+c));
	}

	void add(String s1,String s2) {
		System.out.println("The Addition of 2 Strings is :"+(s1+s2));
	}

}
