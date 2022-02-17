package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.AbstractShape;
import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		List<AbstractShape>list=new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int N=sc.nextInt();
		for(int i=1; i<=N; i++) {
			System.out.print("Shape #"+i+" data:");
			System.out.print("Retangule or Circle (r/c)?");
			char cr =sc.next().charAt(0);
			System.out.print("Color(BLACK/BLUE/RED)");
			Color color = Color.valueOf(sc.next());
				if(cr=='r') {
					System.out.print("Width: ");
					Double width=sc.nextDouble();
					System.out.print("Heigth: ");
					Double heigth=sc.nextDouble();
					list.add(new Rectangle(color, width, heigth));
				}
				else {
					System.out.print("Radius: ");
					Double radius=sc.nextDouble();
					list.add(new Circle(color, radius));
				}
		}
			System.out.println();
			System.out.println("SHAPE AREAS:");
			for (AbstractShape shape: list) {
				System.out.println(String.format("%.2f",shape.area())+" Color: "+shape.getColor());
			}
			
				
				
			sc.close();
	}
	}
