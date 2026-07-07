package controlflow;
import java.util.Scanner;
/**
 * Author : sirin
 * Date : Jul 6, 2026
 * Time : 11:31:46 AM
 * Email : sirinandini.a@gmail.com
 * Program to enter a Positive Number & display it
 */

public class DoWhileDemo {

	public static void main(String[] args) {

		int number;
		Scanner scanner=new Scanner(System.in);

		do {
			
			System.out.println("Enter a Number : ");
			number = scanner.nextInt();
			System.out.println(number);
		}
		while(number>0);

		System.out.println("The Entered Number is : "+number);

		scanner.close();
	}

}
