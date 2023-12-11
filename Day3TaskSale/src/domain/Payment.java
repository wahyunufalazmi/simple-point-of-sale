package domain;

public abstract class Payment {

	protected double amount;
	
	public Payment(double amount) {
		this.amount = amount;
	}
	
	public String Validate() {
		return "Payment is valid";
	}
	
}
