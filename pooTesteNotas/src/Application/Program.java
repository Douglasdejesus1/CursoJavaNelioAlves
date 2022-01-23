package Application;
import java.util.Locale;
import java.util.Scanner;
import Entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		Student student=new Student();
		
		System.out.println("Entrada: ");
		student.name=sc.nextLine();
		student.n1=sc.nextDouble();
		student.n2=sc.nextDouble();
		student.n3=sc.nextDouble();
		
		
		System.out.println("Saida: ");
		System.out.println("FINAL GRADE = "+ student.nf());
		
		if(student.nf()<60) {
			System.out.println("FALED");
			System.out.printf("MiSSING %.2f POINTS",student.missingPoints());
		}
		else {
				System.out.println("PASS");
			}
		
		sc.close();
	}

}
