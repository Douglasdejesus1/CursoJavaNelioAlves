package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d =Date.from(Instant.parse("2020-06-12T15:42:59Z"));	
		System.out.println(sdf.format(d));
		
		Calendar cal=Calendar.getInstance();
		cal.setTime(d);
		//cal.add(Calendar.HOUR_OF_DAY, 4);
		//d=cal.getTime();
		int minutes=cal.get(Calendar.MINUTE);
		int month=cal.get(Calendar.SECOND);
		
		System.out.println("Minutes: "+minutes);
		System.out.println("Second: "+month);
		
		
		
		
	}
}
