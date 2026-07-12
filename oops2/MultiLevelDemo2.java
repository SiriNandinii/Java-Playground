package oopsdemo2;
import java.util.Scanner;

/**
 * Author : sirin
 * Date : Jul 7, 2026
 * Time : 4:39:35 PM
 * Email : sirinandini.a@gmail.com
 */

public class MultiLevelDemo2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter Account Details of Customer(Cust No,Name, Balance):");
		int custNo=scanner.nextInt();
		scanner.nextLine();
		String name=scanner.nextLine();
		int balance=scanner.nextInt();
		final int MIN_BAL=1000;
		System.out.println("Enter Amount to Deposit:");
		int deposit=scanner.nextInt();
		System.out.println("Enter Amount to Withdraw:");
		int withdraw=scanner.nextInt();

		AccountDetails ac1=new AccountDetails(custNo,name,MIN_BAL,balance,deposit,withdraw);

		ac1.display(); // invoke display() method of AccountDetails
		scanner.close();

	}

}
