import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.FRENCH);
		//Digite syso e pressione CTRL + SPACE
		//%f =ponto flutuante
		//%d=inteiro
		//%s=texto
		//%n =quebra de linha
		int idade=25;
		double altura = 1.68;
		double media= idade/altura;
		char nome = '\u0061';
	System.out.println(idade+" "+altura+" "+nome+" "+media);
	System.out.printf("%.2f%n",media);
	Locale.setDefault(Locale.US);
	System.out.printf("%.4f%n",media);
	System.out.println("Altura = "+altura+" metros");
	System.out.printf("Altura = %.2f metros%n",altura);
	System.out.printf("Altura = %.2f metros, idade = %d anos, ultima letra do nome= %s %n",altura,idade,nome);
	System.out.println();
	float b,B,h,area;
	b=6f;
	B=8f;
	h=5f;
	area=(b+B)/2f*h;
	System.out.println(area);
	}

}
