package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {
	
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 =new Comment("Heve a nice trip!");
		Comment c2 =new Comment("Wow that's awesome");
		Post p1=new Post(sdf.parse("21/06/2018 13:05:44"), 
				"Treveling to New Zealand", 
				"I'm going to visit this wonderful country", 
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		Comment c3 =new Comment("Good Nigth!");
		Comment c4 =new Comment("May the Force be with you");
		Post p2=new Post(sdf.parse("30/01/2022 16:51:29"), 
				"Good night guys", 
				"See you tomorrow", 
				12223);
		p2.addComment(c3);
		p2.addComment(c4);
		System.out.println(p2);
	}

}
