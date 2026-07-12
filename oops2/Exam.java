package oopsdemo2;

/**
 * Author : sirin
 * Date : Jul 8, 2026
 * Time : 10:12:50 AM
 * Email : sirinandini.a@gmail.com
 */

public class Exam {

	// properties
	private String examName;
	private int duration;
	private QuestionPaper questionPaper;



	// constructor
	public Exam(String examName, int duration, String syllabus, int totalQuestions) {

		this.examName = examName;
		this.duration = duration;

		// QuestionPaper object created inside Exam
		this.questionPaper = new QuestionPaper(syllabus, totalQuestions);
	}


	// method
	public void displayExamDetails() {
		System.out.println("Exam Name         : " + examName);
		System.out.println("Duration (Minutes): " + duration);
		questionPaper.displayQuestionPaperDetails();
	}

}
