package oopsdemo2;

/**
 * Author : sirin
 * Date : Jul 8, 2026
 * Time : 9:47:01 AM
 * Email : sirinandini.a@gmail.com
 */

public class Author {

	// properties
	private String authorName;
	private int age;
	private String place;
	
	
	// constructor
	public Author(String authorName, int age, String place) {
		this.authorName = authorName;
		this.age = age;
		this.place = place;
	}

	
	
	// Getters
	public String getAuthorName() {
		return authorName;
	}


	public int getAge() {
		return age;
	}


	public String getPlace() {
		return place;
	}
	
	
	
}
