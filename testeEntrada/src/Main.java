import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//float numero real menor, double real so que maior
		String x;
		x=sc.next();
		int y;
		y=sc.nextInt();
		double z;
		z=sc.nextDouble();
		char w;
		w=sc.next().charAt(0);
		 
		
		
		System.out.printf("voce digitou "+w);
		
		
		
		
		sc.close();
	}

}
