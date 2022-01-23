import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int idade;
		double salario;
		String nome;
		char sexo;
		idade = 32;
		salario = 4560.9;
		nome = "Maria Silva";
		sexo = 'F';
		
		
		System.out.print("A funcionaria: "+nome+", genero: "+sexo+ ", ganha: R$ "+String.format("%.2f",salario)+" por mês.");
		
		
		
	}
}
	
