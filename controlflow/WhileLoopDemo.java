package controlflow;

import java.util.Scanner;

/**
* Author : sirin
* Date : Jul 6, 2026
* Time : 10:18:48 AM
* Email : sirinandini.a@gmail.com
* Java Program to display your name 10 time
*/

public class WhileLoopDemo {
	
	public static void main(String[] args) {
		
		String name;
		int num = 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		name = scan.next();
		
		while (num <= 10) {
			
			System.out.println(num+ " - "+name);
			num += 1;
		}
		
		System.out.println(" *************** ");
		
		num = 10;
		while (num >= 1) {
			
			System.out.print(num+ "\t");
			num -= 1;
		}
		
		scan.close();
		
		
	}

}
