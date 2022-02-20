package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.AbstractShape;
import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		List<AbstractShape>myShapes=new ArrayList<>();
		Color color = Color.valueOf("BLACK");
		myShapes.add(new Rectangle(color,3.0,2.0));
		color = Color.valueOf("BLUE");
		myShapes.add(new Circle(color,2.0));	
		
		List<Circle> myCircle = new ArrayList<>(); 
		myCircle.add(new Circle(color,2.0));
		myCircle.add(new Circle(color,3.0));
				
		System.out.println("Total area: "+String.format("%.2f",totalArea(myCircle)));
				
			
	}
	public static double totalArea(List<? extends AbstractShape> list) {
		double sum=0.0;
		for (Shape s: list) {
			sum +=s.area();
		}
		return sum;
	}

	}
