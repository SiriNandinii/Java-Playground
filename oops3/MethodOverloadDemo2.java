package oopsdemo3;

/**
 * Author : sirin
 * Date : Jul 8, 2026
 * Time : 11:03:18 AM
 * Email : sirinandini.a@gmail.com
 */

public class MethodOverloadDemo2 {


	public static void main(String[] args) {
		// Using Default Constructor
		NotificationService service1 = new NotificationService();

		service1.sendNotification("Your salary has been credited.");
		System.out.println("--------------------------------");

		
		// Using Parameterized Constructor
		NotificationService service2 =new NotificationService("Coforge Technologies", "HR Department");

		
		service2.sendNotification("employee@coforge.com","Your leave request is approved.");
		System.out.println("--------------------------------");

		
		
		service2.sendNotification("admin@coforge.com","Database Server Down!", 1);
	}


}
