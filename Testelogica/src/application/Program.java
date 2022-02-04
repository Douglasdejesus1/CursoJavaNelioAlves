package application;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

		public String solucao(String horario, int minutosAcrescimo) {
			
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			
			Date x= new Date(String.valueOf(horario) + minutosAcrescimo);
			return sdf.format(x);
		}
		
		solucao(3:00;30);
}

