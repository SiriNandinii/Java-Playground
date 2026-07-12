package oopsdemo2;

/**
 * Author : sirin
 * Date : Jul 7, 2026
 * Time : 3:14:59 PM
 * Email : sirinandini.a@gmail.com
 */

public class Developer extends Employee{

	private String skillSet;
	private String projectName;


	// Constructor
	public Developer(int empId, String name, String skillSet, String projectName) {
		super(empId, name);
		this.skillSet = skillSet;
		this.projectName = projectName;
	}


	// Methods
	public void displayDeveloperDetails() {
		System.out.println("Skill Set: " + skillSet);
		System.out.println("Project Name: " + projectName);
	}


}
