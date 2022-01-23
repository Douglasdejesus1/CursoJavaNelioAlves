import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("De 1 a 7 Qual o dia da semana?");
		int x;
		String dia;
		
		x=sc.nextInt();
		
		switch(x) {
		case 1:
			dia="domingo";
			break;
		case 2:
			dia="segunda";
			break;
		case 3:
			dia="terca";
			break;
		case 4:
			dia="quarta";
			break;
		case 5:
			dia="quinta";
			break;
		case 6:
			dia="sexta";
			break;
		case 7:
			dia="sabado";
			break;
		default:
			dia="Opcao invalida";
		}
		System.out.println("Dia da semana: "+dia);
			
		sc.close();
	}

}
