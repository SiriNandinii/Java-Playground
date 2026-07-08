package oopsdemo1;
/**
* Author : sirin
* Date : Jul 7, 2026
* Time : 9:40:04 AM
* Email : sirinandini.a@gmail.com
*/

public class BookTest {
	
	public static void main(String[] args) {
		
		Book b1 = new Book();
		
		b1.setBookId(101);
		b1.setBookName("Harry Potter");
		b1.setPrice(500);
		b1.setPublisher("JK Rowling");
		
		
		System.out.println(" ****** Book Details ****** ");
		b1.display();
		System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getPrice()+" "+b1.getPublisher());
		System.out.println("Discounted price of the book : "+b1.discountPrice());
		
		System.out.println(b1);
		
	}

}
