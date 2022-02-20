package application;

import java.util.ArrayList;
import java.util.List;

public class PrintService<G> {
	List<G> list=new ArrayList<>();
	
	public void addValue(G value) {
		list.add(value);
	}

	public G first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	public void print() {
		System.out.print("[");
		if(!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for( int i=1;i<list.size();i++) {
			System.out.print(", "+list.get(i));
		}
		System.out.println("]");
		
	}
}
