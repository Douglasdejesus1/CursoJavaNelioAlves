package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.Paypal;
import model.services.ProcessingPayment;

public class Program {
	
	
	
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		
		System.out.print("Number: ");
		int contractData = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		sc.nextLine();
		Date start = sdf.parse(sc.nextLine());
		
		System.out.print("Contract value: ");
		double totalValue=sc.nextDouble();
		
		Contract cont = new Contract(contractData,start,totalValue);
		
		
		System.out.print("Enter number of installments: ");
		int number = sc.nextInt();
		ProcessingPayment processingPayment=new ProcessingPayment(new Paypal());
		processingPayment.processContract(cont, number);
		
		System.out.println("Installments");
		
		for (Installment inst : cont.getInstallmensts()) {			
			System.out.println(inst.toString());
			}
		
		
	}

}
