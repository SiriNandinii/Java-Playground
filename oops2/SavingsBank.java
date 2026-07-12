package oopsdemo2;

/**
 * Author : sirin
 * Date : Jul 7, 2026
 * Time : 4:32:54 PM
 * Email : sirinandini.a@gmail.com
 */

public class SavingsBank extends Account {

    // Intermediate class

    protected int minBalance;
    protected int balance;

    public SavingsBank(int accNo, String name, int minBalance, int balance) {
        super(accNo, name);
        this.minBalance = minBalance;
        this.balance = balance;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Minimum Balance : " + minBalance);
        System.out.println("Current Balance : " + balance);
    }
}