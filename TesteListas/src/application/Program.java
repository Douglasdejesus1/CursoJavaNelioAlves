package application;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List <String>lista= new ArrayList<>();
		
		lista.add("Maria");
		lista.add("Douglas");
		lista.add("Flavia");
		lista.add("Rodrigo");
		lista.add(2,"Marco");
		System.out.println(lista.size());
		lista.remove("Rodrigo");
		lista.remove(0);
		lista.add("Maria");
		System.out.println(lista.get(3));
		System.out.println();
		for(String w: lista) {
			System.out.println(w);
		}
		lista.removeIf(w->w.charAt(0)=='M');
		System.out.println();
		for(String w: lista) {
			System.out.println(w);
		}
		System.out.println("Index of Douglas: "+ lista.indexOf("Dougls"));
		lista.add(0,"Zeni");
		System.out.println();
		System.out.println("Index of Douglas: "+ lista.indexOf("Douglas"));
		lista.add("Dawlton");
		
		List<String> result=lista.stream().filter(w->w.charAt(0)=='D').collect(Collectors.toList());
		for(String w: result) {
			System.out.println(w);
		}
		System.out.println("----------------------");
		String name=lista.stream().filter(w->w.charAt(0)=='D').findFirst().orElse(null);
		String name2=lista.stream().filter(w->w.charAt(0)=='W').findFirst().orElse(null);
		System.out.println(name+"--"+name2);
	}

}
