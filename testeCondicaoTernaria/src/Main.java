import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double preco = 45.43;
		double desconto=(preco<50)?preco*0.5:preco*0.01;
		preco=preco-desconto;
		System.out.println("PRECO FINAL: "+preco);
		
		
		
		sc.close();
	}

}
