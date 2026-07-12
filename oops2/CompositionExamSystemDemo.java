package oopsdemo2;

/**
 * Author : sirin
 * Date : Jul 8, 2026
 * Time : 10:21:42 AM
 * Email : sirinandini.a@gmail.com
 */

public class CompositionExamSystemDemo {

	public static void main(String[] args) {
		Exam ocjpExam = new Exam("OCJP Certification",120,"Java Basics, OOP, Collections, Exceptions",60);

		System.out.println("----- OCJP Exam Details -----");
		ocjpExam.displayExamDetails();

		System.out.println();

		Exam microsoftExam = new Exam("Microsoft Certification",150,"C#, .NET, Azure Fundamentals",50);

		System.out.println("----- Microsoft Exam Details -----");
		microsoftExam.displayExamDetails();
	}

}
