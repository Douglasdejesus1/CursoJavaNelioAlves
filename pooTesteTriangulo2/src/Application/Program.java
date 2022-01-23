package Application;
import java.util.Locale;
import java.util.Scanner;
import Entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		Triangle x,y;
		x= new Triangle();
		y=new Triangle();
		
		System.out.println("Enter the measures of triangle x: ");
		x.a=sc.nextDouble();
		x.b=sc.nextDouble();
		x.c=sc.nextDouble();
		System.out.println("Enter the measures of triangle y: ");
		y.a=sc.nextDouble();
		y.b=sc.nextDouble();
		y.c=sc.nextDouble();
		
		double areax=x.area();
		double areay=y.area();
		
		
		System.out.printf("Area do trigulo x: %.4f%n",areax);
		System.out.printf("Area do trigulo y: %.4f%n",areay);
		
	}

}
