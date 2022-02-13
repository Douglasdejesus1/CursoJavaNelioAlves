package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		


				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);

				List<Product> list = new ArrayList<>();
				
				System.out.println("Enter file path: ");
				String file = sc.nextLine();
				Path path= Paths.get(file);
				File sourceFile = new File(file);
				
				try {
					List<String> readAllLines = Files.readAllLines(path);
					
					String sourceFolderStr = sourceFile.getParent();
					
					boolean success = new File(sourceFolderStr + "\\out").mkdir();
					
					String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
					
					for(String line: readAllLines) {
						String[] fields = line.split(",");
						String name = fields[0];
						double price = Double.parseDouble(fields[1]);
						int quantity = Integer.parseInt(fields[2]);

						list.add(new Product(name, price, quantity));
					}
					try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

						for (Product item : list) {
							bw.write(item.getName() + "," + String.format("%.2f", item.total()));
							bw.newLine();
						}

						System.out.println(targetFileStr + " CREATED!");
						
					} catch (IOException e) {
						System.out.println("Error writing file: " + e.getMessage());
					}

				} catch (IOException e) {
					System.out.println("Error reading file: " + e.getMessage());
				}

				sc.close();
			}
		}

