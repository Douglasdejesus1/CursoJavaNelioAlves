package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		Map<String,String>cookies = new TreeMap<>();
		
		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "11954861561");
		
		
		cookies.remove("email");
		cookies.put("phone", "0001");
		
		System.out.println("Contains 'phone' key: "+cookies.containsKey("phone"));
		System.out.println("phone number: "+cookies.get("email"));
		System.out.println("Size: "+cookies.size());
		System.out.println("All Cookies: ");
		for(String key : cookies.keySet()) {
			System.out.println(key+": "+cookies.get(key));
		}
	}

}
