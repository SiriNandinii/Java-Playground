package basics;

import java.util.Scanner;

/**
* Author : sirin
* Date : Jul 4, 2026
* Time : 11:44:12 AM
* Email : sirinandini.a@gmail.com
* Java Program to demonstrate the Student Result Management System. 
* This program allows you to input student details, calculate their results based on 
* marks obtained in various subjects, and display the final result.
*/

public class StudentResult {
	
	public static void main(String[] args) {
		
		//Declarations
		int rollNumber;
		String firstName;
		float marks1,marks2,marks3,marks4,marks5,total,percentage;
		Scanner scan = new Scanner(System.in);

		//Input
		System.out.println("Enter Name of Student & Roll Number :");
		firstName = scan.next();
		rollNumber = scan.nextInt(); //Single word
		
		System.out.println("Enter Marks of 5 Subjects");
		
		System.out.println("Subject 1 : ");
		marks1 = scan.nextInt();

		System.out.println("Subject 2 : ");
		marks2 = scan.nextInt();
		
		System.out.println("Subject 3 : ");
		marks3 = scan.nextInt();
		
		System.out.println("Subject 4 : ");
		marks4 = scan.nextInt();
		
		System.out.println("Subject 5 : ");
		marks5 = scan.nextInt();
		
		
		//Calculate Total marks and percentage
		total = marks1 + marks2 + marks3 + marks4 + marks5;
		percentage = total/5;
		

		//Display
		System.out.println("********** Student Information **********");
		System.out.println("Roll Number          : "+rollNumber);
		System.out.println("Student\tName        : "+firstName);
		System.out.println("Student\tMarks       : "+marks1 +" "+marks2+" "+marks3+" "+marks4+" "+marks5);
		System.out.println("Total \"Marks\"      : "+total);
		System.out.println("------------------------------------------");
		System.out.println("\\\\Percentage       : "+String.format("%.2f",percentage));
		System.out.println("\\\\Percentage       : "+percentage);
		System.out.println("******************************************");
		
		
		scan.close();
	}

}
