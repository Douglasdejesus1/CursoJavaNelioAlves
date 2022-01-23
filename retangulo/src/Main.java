import java.util.Scanner;
import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double b,a,area,perimetro,diagonal;
		
		System.out.print("Base do retangulo: ");
		b=sc.nextDouble();
		System.out.print("Altura do retangulo: ");
		a=sc.nextDouble();
		
		area=a*b;
		perimetro=2*(a+b);
		diagonal=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		
		System.out.println("AREA ="+String.format("%.4f",area));
		System.out.println("PERIMETRO ="+String.format("%.4f",perimetro));
		System.out.println("DIAGONAL= "+String.format("%.4f",diagonal));
		
		sc.close();
	}

}