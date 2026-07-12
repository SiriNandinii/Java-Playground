package oopsdemo3;

/**
 * Author : sirin
 * Date : Jul 8, 2026
 * Time : 2:20:24 PM
 * Email : sirinandini.a@gmail.com
 */

public class FinalDemo {

	public static void main(String[] args) {
		// Using RBI rules
		RBI rbi = new RBI();
		rbi.showRBIGuidelines();

		// Creating customer home loans
		HomeLoan loan1 = new HomeLoan("Alice", 3000000, 10000);
		HomeLoan loan2 = new HomeLoan("Bob", 5000000, 15000);

		loan1.showLoanDetails();
		System.out.println("-------------------");
		loan2.showLoanDetails();

		// ❌ ERROR if you try to modify final variable
		//  RBI.MIN_HOME_LOAN_RATE = 7.0;  // Not allowed
		//     loan1.PROCESSING_FEE = 20000;  // Not allowed
	}

}
