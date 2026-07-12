package oopsdemo2;

/**
* Author : sirin
* Date : Jul 8, 2026
* Time : 9:45:45 AM
* Email : sirinandini.a@gmail.com
*/

public class Publisher {
	
	//Properties
	private String name;
	private String publisherID;
	private String city;
	
	
	//Constructor
	public Publisher(String name, String publisherID, String city) {
		this.name = name;
		this.publisherID = publisherID;
		this.city = city;
	}


	
	// Getters	
	
	public String getName() {
		return name;
	}


	public String getPublisherID() {
		return publisherID;
	}


	public String getCity() {
		return city;
	}

	
	

}
