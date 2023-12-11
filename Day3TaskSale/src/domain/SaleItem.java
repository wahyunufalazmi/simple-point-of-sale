package domain;

public class SaleItem {
	
	private int quantity;
	private double price;
	
	public double totalPrice(int quantity, double price) {
		this.quantity = quantity;
		this.price = price;
		return quantity * price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

}
