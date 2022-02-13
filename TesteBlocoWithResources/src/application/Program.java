package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	
	public static void main(String[] args) throws NumberFormatException{
		String path = "C:\\Users\\Douglas\\Desktop\\new paste\\origin.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line !=null) {
				String [] fields = line.split(",");
				
				String name = fields[0];
				
				double price = Double.parseDouble(fields[1]);
				
				int quantity = Integer.parseInt(fields[2]);
				
				System.out.println(name);
				System.out.println(price);
				System.out.println(quantity);
				line = br.readLine();
			}
			
		}
		catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
	}

}	
