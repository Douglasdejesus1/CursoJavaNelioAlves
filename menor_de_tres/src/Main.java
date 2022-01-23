import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int v1,v2,v3,menor;
		
		System.out.print("Primeiro Valor: ");
		v1=sc.nextInt();
		System.out.print("Segundo Valor: ");
		v2=sc.nextInt();
		System.out.print("Terceiro Valor: ");
		v3=sc.nextInt();
		
		menor=0;
		if(v1<v2 && v1<v3) {
			menor=v1;
		}
			else if(v2<v3) {
			menor=v2;
			}
			else {
				menor=v3;
			}
		
		System.out.println("MENOR = "+menor);

		
		
		
  sc.close();
	}

}
