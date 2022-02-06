package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		methodo1();
		System.out.println("End of program");
		

	}
	public static void methodo1() {
		System.out.println("+++METHODO1 START+++");
		methodo2();
		System.out.println("+++METHODO1 END+++");
	}
		
		
	public static void methodo2() {
		System.out.println("+++METHODO2 START+++");
		Scanner sc = new Scanner(System.in);
	
		try{
			String[] vect = sc.nextLine().split(" ");
			int position =sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.close();
		}
		
		catch(InputMismatchException e) {
			System.out.println("input error");
		}
		System.out.println("+++METHODO2 END+++");
		sc.close();
		}
}
