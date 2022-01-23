import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter thee numbers:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		int higher =max(x,y,z);
		
		showResult(higher);
		
		sc.close();		
	}
public static int max(int x, int y, int z) {
	int maior;
	if(x>y && x>z) {
		maior=x;
	} else if(y>z) {
		maior=y;
	} else {
		maior=z;
	}
	return maior;
}

public static void showResult(int value) {
	System.out.println("Higher ="+value);
}
}	

