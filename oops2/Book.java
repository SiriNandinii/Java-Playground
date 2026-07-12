package oopsdemo2;

/**
 * Author : sirin
 * Date : Jul 8, 2026
 * Time : 9:48:39 AM
 * Email : sirinandini.a@gmail.com
 */

public class Book {

	private String name;
	private int price;



	//Aggregation
	private Author author;
	private Publisher publisher;




	// Constructor

	public Book(String name, int price, Author author, Publisher publisher) {
		this.name = name;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
	}




	// Methods

	void display(){
		System.out.println("*************** Book Details ****************");
		System.out.println("Book Name    : "+name);
		System.out.println("Book Price   : "+price);

		System.out.println("------------Author Details----------");
		System.out.println("Author Name  : "+author.getAuthorName());
		System.out.println("Author Age   : "+author.getAge());
		System.out.println("Author place : "+author.getPlace());

		System.out.println("------------Publisher Details-------");
		System.out.println("Publisher Name: "+publisher.getName());
		System.out.println("Publisher ID  : "+publisher.getPublisherID());
		System.out.println("Publisher City: "+publisher.getCity());

	}


}
