package controlflow;
import java.util.Scanner;

/**
* Author : sirin
* Date : Jul 4, 2026
* Time : 12:49:01 PM
* Email : sirinandini.a@gmail.com
*/

public class SingleDigit {
	
	public static void main(String[] args) {
		
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		num = scan.nextInt();
		
		if (num > -10 && num < 10) {
			System.out.println(num+" is a Single digit.");
		}
		else {
			System.out.println(num+" is NOT a Single digit.");
		}
		
		scan.close();
	}
	
}
