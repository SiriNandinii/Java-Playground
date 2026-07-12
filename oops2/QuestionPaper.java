package oopsdemo2;

/**
 * Author : sirin
 * Date : Jul 8, 2026
 * Time : 10:11:39 AM
 * Email : sirinandini.a@gmail.com
 */

public class QuestionPaper {
	
	// properties 
	private String syllabus;
	private int totalQuestions;

	
	
	// Constructor
	public QuestionPaper(String syllabus, int totalQuestions) {
		super();
		this.syllabus = syllabus;
		this.totalQuestions = totalQuestions;
	}


	// Method
	public void displayQuestionPaperDetails() {
		System.out.println("Syllabus          : " + syllabus);
		System.out.println("Total Questions   : " + totalQuestions);
	}

}
