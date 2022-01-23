package util;

public class CurrencyConverter {
	//public double dollar;
	//public double bought;
	public static double tax=6;
	
	
	public static double value(double bought,double dollar) {
		return bought*dollar*(1+tax/100);
	}
	
}
