package basics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
* Author : sirin
* Date : Jul 4, 2026
* Time : 12:10:52 PM
* Email : sirinandini.a@gmail.com
* Java program to calculate the perimeter of a rectangle, square, and circle,
* using BufferedReader for input.
*/

public class Perimeter {

	public static void main(String[] args) throws IOException {
		
		// Declarations
		double length, breadth, perimeter;
		
		//Create BufferedReader object for taking input at runtime
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		//Input for Rectangle
		System.out.println("Enter length of Rectangle : ");
		length = Double.parseDouble(br.readLine());
		
		System.out.println("Enter breadth of Rectangle : ");
		breadth = Double.parseDouble(br.readLine());
		
		// Calculate for Rectangle
		perimeter = 2 * (length + breadth);
		
		//Output for Rectangle
		System.out.println("Perimeter of Rectangle : "+perimeter);
		
		
		String name;
		int age;
		
		System.out.println("Enter your Name : ");
		name = br.readLine();
		
		System.out.println("Enter your Age : ");
		age = Integer.parseInt(br.readLine());
		
		System.out.println("Hello "+name+"! Your Age is "+age);
	}

}
