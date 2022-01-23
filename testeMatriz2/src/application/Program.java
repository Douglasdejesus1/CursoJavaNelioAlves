package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Quantas linhas tem sua matriz?");
		int N = sc.nextInt();
		System.out.print("Quantas colunas tem sua matriz?");
		int M = sc.nextInt();
		int mat[][]=new int[N][M];
		
		for (int i=0;i<N;i++) {
			for (int j=0;j<M;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.print("Digite um comparador: ");
		int x=sc.nextInt();
		for (int i=0;i<N;i++) {
			for (int j=0;j<M;j++) {
				 if (x==mat[i][j]) {
					System.out.println("Posicion "+i+","+j); 
					if(j>0)
					System.out.println("Left: "+mat[i][j-1]);
					if(j<mat[i].length-1)
					System.out.println("Right: "+mat[i][j+1]);
					if(i>0)
					System.out.println("Up: "+mat[i-1][j]);
					if(i<mat.length-1)
					System.out.println("Down: "+mat[i+1][j]);
					
					System.out.println();
					}
			}
		}
		
		
		
				sc.close();
	}

}
