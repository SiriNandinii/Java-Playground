package controlflow;
import java.util.Scanner;

/**
* Author : sirin
* Date : Jul 6, 2026
* Time : 11:59:18 AM
* Email : sirinandini.a@gmail.com
*/

public class Factorial {
	
	public static void main(String[] args) {
		// Program to find Factorial of a Number 1*1*2*3...*n


		  int num, fact=1;
		        Scanner scanner=new Scanner(System.in);

		        System.out.println("Enter a Number : ");
		        num=scanner.nextInt();
		        scanner.close();

		        for (int i = 1; i <=num; i++) {
		           fact*=i;
		        }
		        System.out.println("The Factorial of "+num+" is: "+fact);
	}
	
}
