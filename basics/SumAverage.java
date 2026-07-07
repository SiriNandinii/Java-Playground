package basics;

import java.util.Scanner;

public class SumAverage {
	
	public static void main(String[] args) {
		
		//Variable Declaration
		int num1, num2, num3, sum;
		float average;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Your name : ");
		String name = scanner.nextLine();		
		
		System.out.println("Enter first number : ");
		num1 = scanner.nextInt();

		System.out.println("Enter second number : ");
		num2 = scanner.nextInt();
		
		System.out.println("Enter third number : ");
		num3 = scanner.nextInt();
		
		
		// Calculating the sum and average
		sum = num1 + num2 + num3;
		average = sum / 3;
		
		
		// Displaying the output
		System.out.println("Hi "+name);
		System.out.println("The sum is : "+sum);
		System.out.println("The average is "+average);
		
		
		// Closing the scanner
		scanner.close();
	}

}
