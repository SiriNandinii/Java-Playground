package controlflow;
import java.util.Scanner;

/**
* Author : sirin
* Date : Jul 6, 2026
* Time : 10:43:48 AM
* Email : sirinandini.a@gmail.com
* Program to find Sum of Series 1+2+3+....+n
*/

public class SumSeries {
	
	public static void main(String[] args) {
		
		int num,i=1,sum=0;
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter a limit :");
		num=scan.nextInt();
		
		while (i<=num) {
			sum += i;
			i += 1;
		}
		
		System.out.println("The sum of the Series is : "+sum);
		scan.close();
	}

}
