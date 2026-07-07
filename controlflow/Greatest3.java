package controlflow;

import java.util.Scanner;

/**
* Author : sirin
* Date : Jul 4, 2026
* Time : 4:22:34 PM
* Email : sirinandini.a@gmail.com
* Java Program to find Greatest of 3 Numbers using If...Else If...Else Statement
*/

public class Greatest3 {
	
	public static void main(String[] args) {
		
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		        
		System.out.println("Enter 3 Numbers : ");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		
		if (a>b && a>c) {
			System.out.println(a+" is the Greatest.");
		}
		else if (b>c && b>a) {
			System.out.println(b+ " is the Greatest.");
		}
		else if (c>a && c>b) {
			System.out.println(c+" is the Greatest.");	
		}
		else {
			System.out.println("All Numbers are Equal.");
		}
		
		scan.close();
	}

}
