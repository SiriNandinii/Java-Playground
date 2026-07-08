package oopsdemo1;

/**
 * Author : sirin
 * Date : Jul 7, 2026
 * Time : 12:21:52 PM
 * Email : sirinandini.a@gmail.com
 */

public class AirCargo {

	// Attributes (Encapsulation - private fields)
	private String bookingId;
	private String senderName;
	private String destination;
	private double weight;
	private double costPerKg;


	// Constructor
	public AirCargo(String bookingId, String senderName, String destination, double weight, double costPerKg) {
		super();
		this.bookingId = bookingId;
		this.senderName = senderName;
		this.destination = destination;
		this.weight = weight;
		this.costPerKg = costPerKg;
	}


	
	// Setter for Weight
	
	public void setWeight(double weight) {
		this.weight = weight;
	}


	// Methods
	
	public double calculateCost() {
		return this.weight * this.costPerKg;
	}

	
	public void bookCargo() {
		System.out.println("\n✅ Cargo booked successfully with Booking ID: " + this.bookingId);
	}

	
	public void generateBill() {
		System.out.println("----- SITA Airlines Cargo Bill -----");
		System.out.println("Booking ID: " + this.bookingId);
		System.out.println("Sender Name: " + this.senderName);
		System.out.println("Destination: " + this.destination);
		System.out.println("Weight: " + this.weight + " kg");
		System.out.println("Rate per Kg: ₹" + this.costPerKg);
		System.out.println("Total Cost: ₹" + calculateCost());
		System.out.println("-------------------------------------");
	}

}
