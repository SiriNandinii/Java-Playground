package oopsdemo1;
import java.util.Scanner;
/**
* Author : sirin
* Date : Jul 7, 2026
* Time : 10:21:44 AM
* Email : sirinandini.a@gmail.com
*/

public class ProductTest {
	
	public static void main(String[] args) {
		
		int id, total, quantity;
		String name;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Product ID : ");
		id = scan.nextInt();
		
		System.out.println("Enter Product Name : ");
		name = scan.next();
		
		System.out.println("Enter Quantity : ");
		quantity = scan.nextInt();
		
		Product p1 = new Product();
		
		p1.setProductId(id);
		p1.setProductName(name);
		p1.setPrice(100);
		p1.setQuantity(quantity);
		
		
		p1.display();
		total = p1.calculateBill();
		System.out.println("Total Bill is : "+total);
		
		
		System.out.println(p1.toString());
		
		scan.close();
	}
	

}
