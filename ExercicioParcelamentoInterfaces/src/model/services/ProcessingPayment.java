package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ProcessingPayment {
	

	
	private PaymentService paymentService;
	
	Calendar cal = Calendar.getInstance();
	
	public ProcessingPayment(PaymentService paymentService) {
		
		this.paymentService = paymentService;
	}



	public void processContract(Contract contract, int months) {
			
			double quota =contract.getTotalValue()/ months;
		
			
			for (int i=1;i<=months;i++) {
				cal.setTime(contract.getDate());
				cal.add(Calendar.MONTH, +i);
				Date dueDate = cal.getTime();				
				double firstAmount = paymentService.interest(quota,i);				
				double finalAmount = paymentService.paymentFee(firstAmount);					
				contract.getInstallmensts().add(new Installment(dueDate, finalAmount));
			}
				
				
				
				
				

	}
	
 

}
