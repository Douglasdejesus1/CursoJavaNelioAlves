package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file full path: ");
		String path = sc.nextLine();

		File logsFile = new File(path);
		Map<String, Integer> votes  = new TreeMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader(logsFile))) {

			String itemCsv = br.readLine();

			while (itemCsv != null) {
				String[] fields = itemCsv.split(",");
				String candidate = fields[0];
				int count = Integer.parseInt(fields[1]);
				
				if (votes.containsKey(candidate)) {
					int votesSoFar =votes.get(candidate);
					votes.put(candidate, count+votesSoFar);
				}
				else {
					votes.put(candidate, count);
				}
				

				itemCsv = br.readLine();

			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		for (String key : votes .keySet()) {
			System.out.println(key + ": " + votes .get(key));

		}
	}
}
