package oopsdemo2;

/**
* Author : sirin
* Date : Jul 8, 2026
* Time : 10:00:14 AM
* Email : sirinandini.a@gmail.com
*/

public class AggregationDemo2 {
	
	public static void main(String[] args) {
		
		Author author = new Author("John", 42, "USA");
		
		Publisher publisher = new Publisher("Sun Publications", "JDSR-III4", "LA");
		
		// Create Book Object & associate with Author & Publisher Objects
		
		Book b = new Book("Java for Beginners", 800, author, publisher);
		
		b.display();
		
	}

}
