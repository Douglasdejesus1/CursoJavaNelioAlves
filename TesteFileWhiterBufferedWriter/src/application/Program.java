package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good Morning", "Googe afternoon", "good nigth"};
		
		String path = "C:\\Users\\Douglas\\Desktop\\new paste\\JavaNewTexto.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for(String line: lines) {
				String[] fields = line.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

			}	
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
