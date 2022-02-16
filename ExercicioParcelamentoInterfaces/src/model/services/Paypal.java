package model.services;

public class Paypal implements PaymentService {
	
	
	public double interest(double amount, int months) {
		return amount +(amount*0.01*months);
	}
	public double paymentFee(double amount) {
		return amount+(amount*0.02);
	}

	

}
