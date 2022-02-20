package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		Object obj;
		Integer inte = 10;

		obj = inte;
		System.out.println(obj);

		/*
		 * List<Object> myObjs = new ArrayList<Object>(); List<Integer> myNumbers = new
		 * ArrayList<Integer>(); myObjs = myNumbers; compilation error
		 */

		/*
		 * List<?> myObjs = new ArrayList<Object>(); List<Integer> myNumbers = new
		 * ArrayList<Integer>(); myObjs = myNumbers; ? is corringa
		 */

		List<Integer> myInts = Arrays.asList(5, 2, 12);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Douglas", "Flavia", "Rodrigo");
		printList(myStrs);
	}

	public static void printList(List<?> list) {
		//ist.add(3); not is compatible with ?
		for (Object obj : list) {
			System.out.println(obj);

		}

	}

}
