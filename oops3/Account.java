package oopsdemo3;

/**
 * Author : sirin
 * Date : Jul 8, 2026
 * Time : 11:55:03 AM
 * Email : sirinandini.a@gmail.com
 */

public class Account {
	//Override Demo

	private String name;
	protected double balance;


	//generate constructor
	public Account(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}


	//generate getters

	public String getName() {
		return name;
	}


	public double getBalance() {
		return balance;
	}



	// final methods cannot be overridden
	final void deposit(double amt) {
		balance += amt;
		System.out.println("Depositing: " + amt);
	}


	void withdraw(double amt) {
		balance -= amt;
		System.out.println("WithDrawing: " + amt);

	}





}
