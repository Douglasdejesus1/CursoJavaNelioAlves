import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// && e; || ou; ! não
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois numeros?");
		int m1,m2,troca;
		m1=sc.nextInt();
		m2=sc.nextInt();
		if (m1<m2) {
			troca=m1;
			m1=m2;
			m2=troca;
		}
		if(m1%m2==0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("NÃO sao Multiplos");
			}
		
		
		
		
		sc.close();
	}

}
