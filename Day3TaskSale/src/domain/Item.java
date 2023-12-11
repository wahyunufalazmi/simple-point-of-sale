package domain;

public class Item {
	
	private String code;
	private double price;
	private String description;
	private String type;
	private boolean isTaxable;
	
	public Item(String code, double price, String description, String type, boolean isTaxable) {
		this.code = code;
		this.price = price;
		this.description = description;
		this.type = type;
		this.isTaxable = isTaxable;
	}

	public String getCode() {
		return code;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public String getType() {
		return type;
	}

	public boolean isTaxable() {
		return isTaxable;
	}

}
