package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Users;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file full path: ");
		String path = sc.nextLine();

		
		File logsFile = new File(path);
		Set<Users> set = new HashSet<>();
		try (BufferedReader br = new BufferedReader(new FileReader(logsFile))) {

			String itemCsv = br.readLine();
			
			while (itemCsv != null) {
				String[] fields = itemCsv.split(" ");
				String name = fields[0];
				String hour = fields[1];
				set.add(new Users(name, hour));
				
				itemCsv = br.readLine();
			
			} 

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		System.out.println("Total users: "+set.size());

	}

}
