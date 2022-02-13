package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sourceFileStr = sc.nextLine();
		File file = new File(sourceFileStr);
		
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc != null){
				sc.close();
			}
		
		
		}
			
	}

}

