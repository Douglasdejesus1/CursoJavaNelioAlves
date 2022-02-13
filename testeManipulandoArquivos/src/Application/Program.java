package Application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath= sc.nextLine();

		File path = new File(strPath);
		/* File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDER: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		File[] files =path.listFiles(File::isFile);
		System.out.println("FILES: ");
		for(File file:files) {
			System.out.println(file);
		}
		
		*/

		
		System.out.println("Name:" + path.getName());
		System.out.println("Parent:" + path.getParent());
		System.out.println("Path:" + path.getPath());
		
		boolean success = new File(path.getPath() +"\\subdir").mkdir();
		System.out.println("Directory created sucessfully: "+ success);
		
		
		sc.close();
	}

}
