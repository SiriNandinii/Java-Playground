package oopsdemo1;
import java.util.Scanner;

/**
 * Author : sirin
 * Date : Jul 7, 2026
 * Time : 12:44:37 PM
 * Email : sirinandini.a@gmail.com
 */

public class ComplexDemo {

	public static void main(String[] args) {

		Complex c1 = new Complex(3,4);
		Complex c2 = new Complex(6,8);
		Complex c3 = new Complex(10,20);

		System.out.print("First Complex Number : ");
		c1.display();

		System.out.print("Second Complex Number : ");
		c2.display();

		System.out.print("Third Complex Number : ");
		c3.display();


		c1.add(c2);
		System.out.print("Sum of c1 and c2 : ");
		c1.display();

		c2.add(c3);
		System.out.print("Sum of c2 and c3 : ");
		c2.display();

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter real and imaginary part of complex number:");
		int r = sc.nextInt();
		int i = sc.nextInt();

		Complex c4 = new Complex(r,i);

		c2.add(c4); //c2+c4
		System.out.println("The Addition of 2 Complex number is:");
		c2.display();

		sc.close();


	}

}
