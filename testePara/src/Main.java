import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		// for(inicio;condicao;incremento){comando}
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x,y,produto;
		System.out.println("Digite um numero: ");
		int N=sc.nextInt();
		produto=0;
		for (int i=1;i<=N;i++) {
		produto=i;	
		System.out.print(produto+" ");
		produto=produto*i;	
		System.out.print(produto+" ");
		produto=produto*i;	
		System.out.println(produto);
		}

		sc.close();
		
	}

}
