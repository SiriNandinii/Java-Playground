package oopsdemo1;

/**
 * Author : sirin
 * Date : Jul 7, 2026
 * Time : 12:54:22 PM
 * Email : sirinandini.a@gmail.com
 * Java program to perform addition of 2 Times
 * t1 --> 12 : 45 :55 
 * t2 --> 10 : 30 :30
 *        23    16 :25
 * 
 * t1 + t2
 *   if sec> 60 .. mins should be incremented by 1 & sec -60,,
 *   if min> 60  ... hrs should be incremented by 1 & min -60
 */

public class Time {
	
	private int hours;
	private int minutes;
	private int seconds;
	
	
	// Constructor
	
	public Time(int hours, int minutes, int seconds) {

		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	
	// Getters and Setters
	
	
	
	
	
	// Methods
	
	public void add(Time obj) {
		
		// Adding seconds
		if((this.seconds + obj.seconds) >= 60) {			
			this.minutes = ((this.minutes + obj.seconds) / 60);
			this.seconds = ((this.seconds + obj.seconds) % 60);
		}
		else {
			this.seconds += obj.seconds;
		}
		
		
		// Adding minutes
		if((this.minutes + obj.minutes) >= 60) {	
			this.hours = ((this.hours + obj.minutes) / 60);
			this.minutes = ((this.minutes + obj.minutes) % 60);
		}
		else {
			this.minutes += obj.minutes;
		}
		
		
		// Adding hours
		if((this.hours + obj.hours) >= 12) {
			this.hours = ((this.hours + obj.hours) % 12);
		}
		else {
			this.hours += obj.hours;
		}
		
	}
	
	
	// Displaying
	public void display() {
		
		System.out.println("Time is : " + this.hours +":"+this.minutes+":"+this.seconds);
	}
	
	
	
	
}
