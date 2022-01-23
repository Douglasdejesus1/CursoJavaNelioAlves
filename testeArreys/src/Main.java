import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Quantas pessoas vc quer declarar a altura? ");
	int N=sc.nextInt();
	double altura[]= new double[N];
	double total=0;
	
	for (int i=0;i<N;i++){
		altura[i]=sc.nextDouble();
		total=total+altura[i];
	}
	double media=total/N;
	
	System.out.println(media);
	
	sc.close();

	}

}
