package arraysdemo;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Author : sirin
 * Date : Jul 6, 2026
 * Time : 12:40:30 PM
 * Email : sirinandini.a@gmail.com
 * Program to enter elements in to array & display it
 */

public class ArraysIO {


	public static void main(String[] args) {

		int[] marks = {78,56,23,44,90,98,67,55,35,84};

		System.out.println(" ********** ARRAY OF MARKS ********** ");
		for (int i=0; i <marks.length; i++) {
			System.out.print(marks[i]+"\t");
		}


		System.out.println();
		System.out.println("The Size of Array : "+marks.length);
		System.out.println("First element of Array : "+marks[0]);
		System.out.println("Last Element of Array : "+marks[marks.length-1]);


		System.out.println(" ********************************************** ");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Total no. of Students :");
		int n=scanner.nextInt();

		int marks2[]=new int[n]; // declare array & allocate memory of size n

		System.out.println("Enter Marks2 Array Elements  : ");
		for (int i = 0; i < n; i++) {
			marks2[i]=scanner.nextInt();
		}

		System.out.println(" ********** Marks2 Array Contents **********");
		for (int i = 0; i < marks2.length; i++) {
			System.out.print(marks2[i]+" ");
		}
		System.out.println();
		System.out.println("Display Marks Array without Loop");
		System.out.println(Arrays.toString(marks));

		scanner.close();
	}

}
