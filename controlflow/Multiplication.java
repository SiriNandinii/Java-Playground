package controlflow;
import java.util.Scanner;

/**
 * Author : sirin
 * Date : Jul 6, 2026
 * Time : 12:15:58 PM
 * Email : sirinandini.a@gmail.com
 */

public class Multiplication {

	public static void main(String[] args) {
		// Program to display Multiplication Table of a number


		int num, mul;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter a Number : ");
		num=scanner.nextInt();
		scanner.close();

		System.out.println("Multiplication Table of : "+num);
		for (int i = 1; i <=10; i++) {
			mul=num*i;
			System.out.println(num+" * "+i+" = "+mul);
		}
	}

}
