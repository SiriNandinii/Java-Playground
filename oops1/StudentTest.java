package oopsdemo1;

/**
* Author : sirin
* Date : Jul 6, 2026
* Time : 4:31:57 PM
* Email : sirinandini.a@gmail.com
*/

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.inputStudentDetails();
		s2.inputStudentDetails();
		s3.inputStudentDetails();
		
		float tot1 = s1.calculateTotalMarks();
		float tot2 = s2.calculateTotalMarks();
		float tot3 = s3.calculateTotalMarks();
		
		
		s1.displayStudentDetails();
		System.out.println("Display Total marks returned to Main : "+tot1);
		
		s2.displayStudentDetails();
		System.out.println("Display Total marks returned to Main : "+tot2);
		
		s3.displayStudentDetails();
		System.out.println("Display Total marks returned to Main : "+tot3);
		
	}

}
