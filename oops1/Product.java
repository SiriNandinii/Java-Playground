package oopsdemo1;

/**
 * Author : sirin
 * Date : Jul 7, 2026
 * Time : 9:57:02 AM
 * Email : sirinandini.a@gmail.com
 * Java OOP to enter ProductId,Product Name, price & qty, calculate the Total bill 
 * & display details
 * 
 * Note: Product Name Should be multiple words.
 */

class Product {

	private int productId;
	private String productName;
	private int price;
	private int quantity;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public void display() {
		System.out.println(" ****** Your Bill ****** ");
		System.out.println("Product ID       : "+this.productId);
		System.out.println("Product Name     : "+this.productName);
		System.out.println("Price            : "+this.price);
		System.out.println("Quantity         : "+this.quantity);
		System.out.println();

	}	
	
	public int calculateBill() {
		return this.price*this.quantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + ", getProductId()=" + getProductId() + ", getProductName()=" + getProductName()
				+ ", getPrice()=" + getPrice() + ", getQuantity()=" + getQuantity() + ", calculateBill()="
				+ calculateBill() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}

