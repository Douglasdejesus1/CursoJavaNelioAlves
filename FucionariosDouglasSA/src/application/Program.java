package application;

import java.util.ArrayList;

import java.util.List;

import java.util.Locale;

import java.util.Scanner;

import entities.Funcionarios;

public class Program {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			
			Scanner sc=new Scanner(System.in);
			
			List<Funcionarios>list=new ArrayList<>();
			
			System.out.println("Quantos funcionarios h? na empresa?");
			int N=sc.nextInt();
			
			
			
			for (int i=0;i<N;i++) {
				System.out.println("Funcionario ("+(i+1)+"):");
				System.out.print("Qual ? o ID: ");
				Integer id=sc.nextInt();
					while (hasId(list,id)) {
						System.out.print("ID j? utilizado, tente novamente: : ");
						id=sc.nextInt();	
					}
				System.out.print("Qual ? o Nome: ");
				sc.nextLine();
				String nome=sc.nextLine();
				System.out.print("Qual ? a Carga Horaria: ");
				Integer ch=sc.nextInt();
				System.out.print("Qual ? o Valor da Hora: ");
				Double valorhora=sc.nextDouble();
				Funcionarios emp = new Funcionarios(id,nome,ch,valorhora);
				list.add(emp);
			}
			char saida;
			do{
			System.out.println("Qual o ID do funcionario que ir? ter o Valor Hora alterado?");
			int idsalario=sc.nextInt();
			Funcionarios emp=list.stream().filter(x->x.getId()==idsalario).findFirst().orElse(null);
			if(emp==null) {
				System.out.println("Este ID nao existe!");
			}
			else {
				System.out.print("Digite o novo Valor por Hora:");
				double nvh = sc.nextDouble();
				emp.setValorhora(nvh);
			}
			System.out.println("Deseja alterar outros IDs? s/n");
			saida=sc.next().charAt(0);
			}while (saida!='n');

			saida='s';
			do{
			System.out.println("Qual o ID do funcionario que ir? ter a carga horaria alterada?");
			int idhora=sc.nextInt();
			Funcionarios emp=list.stream().filter(x->x.getId()==idhora).findFirst().orElse(null);
			if(emp==null) {
				System.out.println("Este ID nao existe!");
			}
			else {
				System.out.print("Digite a nova CargaHoraria:");
				int nch = sc.nextInt();
				emp.setCh(nch);
			}
			System.out.println("Deseja alterar outros IDs? s/n");
			saida=sc.next().charAt(0);
			}while (saida!='n');
			
			System.out.println();
			System.out.println("Empregados:");
			for(Funcionarios e:list) {
				System.out.println(e);
				
			}
			
			sc.close();
	}
public static boolean hasId(List<Funcionarios>list,int id) {
	Funcionarios emp=list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
	return emp!=null;
    }
public static Integer position(List<Funcionarios>list, int id) {
	for(int i=0;i<list.size();i++) {
		if(list.get(i).getId()==id) {
			return i;
		}
	}
	return null;
}

}

