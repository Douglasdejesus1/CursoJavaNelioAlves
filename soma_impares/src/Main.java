import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int m,n,i,soma,troca;
		
		System.out.println("Digite dois numeros: ");
		m=sc.nextInt();
		n=sc.nextInt();
		
		if(n<m) {
			troca=m;
			m=n;
			n=troca;
		}
		soma=0;
		for (i=m+1;i<n;i++) {
			if(i%2!=0){
		soma=soma+i;	
		     }
		}
		System.out.println("SOMA DOS IMPARES ="+soma);
		
		
sc.close();
	}
}
