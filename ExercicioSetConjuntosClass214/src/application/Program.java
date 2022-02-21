package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<Integer> a = new HashSet<>();
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			a.add(sc.nextInt());
		}
		Set<Integer> b = new HashSet<>();
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			a.add(sc.nextInt());
		}
		Set<Integer> c = new HashSet<>();
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			a.add(sc.nextInt());
		}
		
		
//intersection
		Set<Integer> d = new HashSet<>(a);
		d.addAll(b);
		d.addAll(c);
		System.out.println("Total studants:"+ d.size());

	}
}