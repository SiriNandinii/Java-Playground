package oopsdemo1;
import java.util.Scanner;

/**
 * Author : sirin
 * Date : Jul 7, 2026
 * Time : 2:21:37 PM
 * Email : sirinandini.a@gmail.com
 */

public class TimeTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		System.out.println(" ***** Time 1 *****");
		System.out.println("Hours    : ");
		int hours1 = scan.nextInt();
		System.out.println("Minutes  :");
		int minutes1 = scan.nextInt();
		System.out.println("Seconds  :");
		int seconds1 = scan.nextInt();
		Time t1 = new Time(hours1, minutes1, seconds1);
		
		
		
		System.out.println(" ***** Time 2 *****");
		System.out.println("Hours    : ");
		int hours2 = scan.nextInt();
		System.out.println("Minutes  :");
		int minutes2 = scan.nextInt();
		System.out.println("Seconds  :");
		int seconds2 = scan.nextInt();
		Time t2 = new Time(hours2, minutes2, seconds2);
		
		
		
		System.out.println(" ***** Time 2 *****");
		System.out.println("Hours    : ");
		int hours3 = scan.nextInt();
		System.out.println("Minutes  :");
		int minutes3 = scan.nextInt();
		System.out.println("Seconds  :");
		int seconds3 = scan.nextInt();
		Time t3 = new Time(hours3, minutes3, seconds3);

		


		t1.display();

		t2.display();

		t3.display();

		

		
		System.out.print("Adding t1 and t2 : ");
		t1.add(t2);
		t1.display();

		

		System.out.print("Adding t3 and t2 : ");
		t3.add(t2);
		t3.display();
	}

}
