package oopsdemo2;

/**
 * Author : sirin
 * Date : Jul 7, 2026
 * Time : 4:32:54 PM
 * Email : sirinandini.a@gmail.com
 */

public class Account {

    // Base class for SavingsBank

    private int accNo;
    private String name;

    public Account(int accNo, String name) {
        this.accNo = accNo;
        this.name = name;
    }

    void display() {
        System.out.println("************ Account Details ************");
        System.out.println("Account Number : " + accNo);
        System.out.println("Customer Name  : " + name);
    }
}