package oopsdemo3;

/**
 * Author : sirin
 * Date : Jul 8, 2026
 * Time : 10:53:07 AM
 * Email : sirinandini.a@gmail.com
 */

public class NotificationService {
	// Attributes
	private String companyName;
	private String senderName;




	// Non-parameterized constructor (Default)
	public NotificationService() {
		companyName = "ABC Technologies";
		senderName = "System";
	}



	// Parameterized Constructor
	public NotificationService(String companyName, String senderName) {
		this.companyName = companyName;
		this.senderName = senderName;
	}



	// Method 1
	public void sendNotification(String message) {
		System.out.println("Company : " + companyName);
		System.out.println("Sender  : " + senderName);
		System.out.println("SMS     : " + message);
	}

	
	
	// Method 2 (Overloaded)
	public void sendNotification(String email, String message) {
		System.out.println("Company : " + companyName);
		System.out.println("Sender  : " + senderName);
		System.out.println("Email   : " + email);
		System.out.println("Message : " + message);
	}

	
	
	// Method 3 (Overloaded)
	public void sendNotification(String email, String message, int priority) {
		System.out.println("Company : " + companyName);
		System.out.println("Sender  : " + senderName);
		System.out.println("Email   : " + email);
		System.out.println("Message : " + message);
		System.out.println("Priority: " + priority);
	}


}
