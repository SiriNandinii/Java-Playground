package controlflow;
import java.util.Scanner;

/**
 * Author : sirin
 * Date : Jul 6, 2026
 * Time : 9:45:18 AM
 * Email : sirinandini.a@gmail.com
 * Java Program to demonstrate the Switch Statement 
 * to perform Arithmetic Operations based on user input.
 */

public class SwitchDemo2 {

	public static void main(String[] args) {

		float num1, num2, result;
		String operator;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First Number :");
		num1=scan.nextInt();
		System.out.println("Enter Second Number :");
		num2=scan.nextInt();

		System.out.println("Enter Operator (+, -, *, /) :");
		operator=scan.next();

		switch (operator) {

		case "+":
			result = num1 + num2;
			System.out.println("Result : "+result);
			break;

		case "-":
			result = num1 - num2;
			System.out.println("Result : "+result);
			break;

		case "*":
			result = num1 * num2;
			System.out.println("Result : "+result);
			break;

		case "/":
			if (num2 != 0) {	
				
				result = num1 / num2;
				System.out.println("Result : "+result);
				break;			
			}
			else {
				System.out.println("Error! Division by Zero is NOT ALLOWED");
			}
		
			default:
				System.out.println("Invalid operator. Please enter of +, -, *, / .");

		}
		
		scan.close();

	}

}
