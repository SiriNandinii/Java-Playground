package oopsdemo3;

/**
 * Author : sirin
 * Date : Jul 8, 2026
 * Time : 2:14:52 PM
 * Email : sirinandini.a@gmail.com
 */

public final class RBI {

/*
Final Variable - Variable’s content cannot be modified
Final Method - A final method cannot be overridden.
Final Class - Cannot extend a Final class

*/



// Final variable (constant)
public static final double MIN_HOME_LOAN_RATE = 6.5; // cannot change

// Final method (standard rule - cannot be overridden by banks)
public final void showRBIGuidelines() {
System.out.println("📌 RBI Guideline: Minimum Home Loan Interest Rate = " + MIN_HOME_LOAN_RATE + "%");
}

}
