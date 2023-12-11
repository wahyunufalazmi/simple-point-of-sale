package domain;

import java.util.Random;

public class QrisPayment extends Payment{

	public QrisPayment(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Validate() {
		// TODO Auto-generated method stub
		return super.Validate();
	}
	
	public String generateQr() {
		Random random = new Random();
        int randomnum = random.nextInt(100000000);
        
        return "QR code: ID"+randomnum;
	}

}
