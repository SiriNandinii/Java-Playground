package oopsdemo1;
import java.util.Scanner;

/**
 * Author : sirin
 * Date : Jul 7, 2026
 * Time : 12:25:58 PM
 * Email : sirinandini.a@gmail.com
 */

public class AirCargoTest {

	public static void main(String[] args) {
		
		
		// Declaration of variables
		Scanner sc = new Scanner(System.in);
		AirCargo cargo = null; 
		int choice;

		
		do {
			System.out.println("\n====== Sita Air Cargo Booking System ======");
			System.out.println("1. Book Cargo");
			System.out.println("2. Update Weight");
			System.out.println("3. Generate Bill");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter Booking ID: ");
				String bookingId = sc.nextLine();

				System.out.print("Enter Sender Name: ");
				String senderName = sc.nextLine();

				System.out.print("Enter Destination: ");
				String destination = sc.nextLine();

				System.out.print("Enter Cargo Weight (kg): ");
				double weight = sc.nextDouble();

				System.out.print("Enter Cost per Kg: ");
				double costPerKg = sc.nextDouble();

				cargo = new AirCargo(bookingId, senderName, destination, weight, costPerKg);
				cargo.bookCargo();
				break;

			case 2:
				if (cargo != null) {
					System.out.print("Enter new weight (kg): ");
					double newWeight = sc.nextDouble();
					cargo.setWeight(newWeight);//update new weight
					System.out.println("✅ Weight updated successfully!");
				} else {
					System.out.println("⚠️ Please book cargo first!");
				}
				break;

			case 3:
				if (cargo != null) {
					cargo.generateBill();
				} else {
					System.out.println("⚠️ No booking found! Please book cargo first.");
				}
				break;

			case 4:
				System.out.println("🚪 Exiting... Thank you for using Air Cargo Booking System!");
				break;

			default:
				System.out.println("❌ Invalid choice! Try again.");
			}
		} while (choice != 4);

		sc.close();


	}

}
