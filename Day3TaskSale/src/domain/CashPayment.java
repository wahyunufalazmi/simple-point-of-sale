package domain;

public class CashPayment extends Payment{
	
	private double cashInHand;

	public CashPayment(double amount, double cashInHand) {
		super(amount);
		// TODO Auto-generated constructor stub
		this.cashInHand = cashInHand;
	}
	
	public double getCash() {
		return cashInHand;
	}

	@Override
	public String Validate() {
		// TODO Auto-generated method stub
		return super.Validate();
	}
	
	public double Change() {
		return cashInHand - amount;
	}

}
