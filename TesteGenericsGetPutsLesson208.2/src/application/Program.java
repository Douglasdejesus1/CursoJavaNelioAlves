package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer>myInts=Arrays.asList(1,2,3,4);
		List<Double>myDouble=Arrays.asList(3.14,6.28);
		List<Object>myObjs= new ArrayList<Object>();
		
		
		copy(myInts,myObjs);
		printList(myObjs);
		copy(myDouble, myObjs);
		printList(myObjs);
		
		/* //COVARIÂNCIA
		List<Integer>intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list= intList;
		Number x = list.get(0);
		
		//list.add(20); // compilation //error set
		
		
		//CONTRAVARIÂNCIA
		List<Object>myObjs = new ArrayList<Object>();
		myObjs.add("Douglas");
		myObjs.add("Flavia");
		
		List<? super Number> myNuns= myObjs;
		myNuns.add(10);
		myNuns.add(3.14);
		
		//Number x = myNuns.get(0); //error get
		
		//list.add(20); // compilation error*/
	}
	public static void copy(List<? extends Number>source, List<? super Number> destiny) {
		for(Number number: source) {
			destiny.add(number);
		}
	}
	public static void printList(List<?> list) {
		for (Object obj: list) {
			System.out.print(obj+" ");
		}
		System.out.println();
	}

}
