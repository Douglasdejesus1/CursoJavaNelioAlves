package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Client c1 = new Client("Douglas", "Douglas@gmail.com");

		Client c2 = new Client("Douglas", "Douglas@gmail.com");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		
		String s1="Teste";
		String s2="Teste";
		System.out.println(s1 == s2);
	}

}
