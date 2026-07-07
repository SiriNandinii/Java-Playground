package controlflow;

import java.util.Scanner;

/**
 * Author : sirin
 * Date : Jul 6, 2026
 * Time : 9:32:05 AM
 * Email : sirinandini.a@gmail.com
 * Java Program to demonstrate the Switch Statement in Java for displaying the day 
 * of the week based on user input.
 */

public class SwitchDemo1 {

	public static void main(String[] args) {

		int day;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a day (1-7) : ");
		day = scan.nextInt();

		switch(day) {

		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thurday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Invalid. Please enter a number between (1-7)");
		}


		scan.close();
	}

}
