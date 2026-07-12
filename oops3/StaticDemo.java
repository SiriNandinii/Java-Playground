package oopsdemo3;

/**
 * Author : sirin
 * Date : Jul 8, 2026
 * Time : 1:02:34 PM
 * Email : sirinandini.a@gmail.com
 */

public class StaticDemo {

	public static void main(String[] args) {

		// invoke static method even before creating object
		 

		Student s1=new Student(101,"Mike");
		Student s2=new Student(102,"John");
		Student s3=new Student(103,"Mary");

		s1.display();
		s2.display();
		s3.display();
		
		// invoke static method even before creating object
		
		Student.collegeChange(); 
		System.out.println(" ----- After changing college name -----");
		s1.display();
		s2.display();
		s3.display();
	}

}
