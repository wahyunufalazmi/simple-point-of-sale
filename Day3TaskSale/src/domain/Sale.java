package domain;

import java.util.Date;

public class Sale {
	
	private int saleNumber;
	private Date date;
	private int quantity;
	private double totalPrice;
	private Item[] item = new Item[10];
	
	public Date getTransDate() {
		this.date = new Date();
		return date;
	}
	
	public void setSaleNumber(int saleNumber) {
		this.saleNumber = saleNumber;
	}


	public int getSaleNumber() {
		return saleNumber;
	}
	
	public void addItem(int quantity, Item item) {
		this.quantity = quantity;
		for(int i=0; i<this.item.length; i++) {
			if(this.item[i] == null) {
				this.item[i] = item;
				break;
			}
		}
	}
	
	public Item[] getItem() {
		return item;
	}
	
	public double totalPrice(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			this.totalPrice = this.totalPrice + arr[i];
		}
		return this.totalPrice;
	}


	public int getQuantity() {
		return quantity;
	}
	
	public double taxNominal(double totalPrice) {
		double Tax = 0.1;
		return totalPrice * Tax;
	}
	
	public double afterTax(double totalPrice, double taxNominal) {
		return totalPrice + taxNominal;
	}

}
