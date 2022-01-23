import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N,i,j,qnt;
		System.out.print("Qual a ordem da matriz? ");
		N=sc.nextInt();
		
		int[][] mat= new int[N][N];
		
		for(i=0;i<N;i++) {
			for(j=0;j<N;j++) {
				System.out.print("Elemento ["+i+","+j+"]: ");
				mat[i][j]=sc.nextInt();
			}
		}
		
	System.out.println("DIAGONAL PRINCIPAL:");
		
		for(i=0;i<N;i++) {
				System.out.print(mat[i][i]+" ");
		}
	System.out.println();
		
	qnt=0;
	for(i=0;i<N;i++) {
		for(j=0;j<N;j++) {
			if (mat[i][j]<0) {
				qnt=qnt+1;
			}
		}
	}
	System.out.print("QUANTIDADE DE NEGATIVOS = "+qnt);
				
  sc.close();
	}
}
