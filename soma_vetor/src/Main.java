import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i,n;
		double soma,media;
		System.out.print("Quantos numeros voce vai digitar? ");
		n=sc.nextInt();
		
		double[] vet = new double[n];
		
		for(i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			vet[i]=sc.nextDouble();
		}
		
		soma=0;
		
		System.out.print("VALORES = ");
		
		for(i=0;i<n;i++) {
			System.out.print(vet[i]+" ");
			soma=soma+vet[i];
		}	
		System.out.println();
		System.out.println("SOMA = "+String.format("%.2f",soma));
		media=soma/n;
		System.out.println("MEDIA = "+String.format("%.2f",media));
		
		
		
  sc.close();
	}

}
