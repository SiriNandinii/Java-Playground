package controlflow;

import java.util.Scanner;

/**
* Author : sirin
* Date : Jul 6, 2026
* Time : 10:51:31 AM
* Email : sirinandini.a@gmail.com
 Program to display Odd & Even numbers in following format
* 
* ODD		EVEN
* ---		----
* 1			2
* 3			4
* 5			6
* 7			8
* 9			10
*/

public class OddEvenDisplay {
	
	public static void main(String[] args) {
		

		
		int num;
		int temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		num = scan.nextInt();

		System.out.println("ODD\tEVEN");
		System.out.println("---\t----");		
		temp = 0;
		
		while (temp < num) {
			
			System.out.println((temp+1) + "\t" + (temp+2));
			temp += 2;
		}
		
		scan.close();
				
	}

}
