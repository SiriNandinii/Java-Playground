package oopsdemo3;

/**
 * Author : sirin
 * Date : Jul 8, 2026
 * Time : 12:27:47 PM
 * Email : sirinandini.a@gmail.com
 */

public class Product {

	private String name;
	private double price;


	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}


	void display() {

		System.out.println("Name : "+name);
		System.out.println("Price: "+price);
	}

}

class Book extends Product {
	private String author;





	public Book(String name, double price, String author) {
		super(name, price);
		this.author = author;
	}





	public String getAuthor() {
		return author;
	}





	@Override
	void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("AUthor : "+author);
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	void showBookInfo() {
		System.out.println("Book Information: ");
		System.out.println("This book is a comprehensive guide to programming.");
		System.out.println("Published by Tech Publishers.");
	}
}

class Laptop extends Product {
	private String manufacturer;

	public Laptop(String name, double price, String manufacturer) {
		super(name, price);
		this.manufacturer = manufacturer;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	@Override
	void display() {
		super.display();
		System.out.println("Manufacturing : "+manufacturer);
	}
	void showSpecs() {
		System.out.println("Laptop Specifications: ");
		System.out.println("Processor: Intel i7");
		System.out.println("RAM: 16GB");
		System.out.println("Storage: 512GB SSD");
	}

}

