import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Caledarioo {

	public static void main(String[] args) {
		
		//Obtener la fecha de hoy
		//Date fecha = new Date();
		int dias = 30;
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2022, 8, 17);
		
		Date sabado = calendar.getTime();
		System.out.println(sabado);
		
		//Calendar calendar = Calendar.getInstance();
		//calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
		//calendar.setTime(fecha);
		
		calendar.set(Calendar.DAY_OF_YEAR,calendar.get(Calendar.DAY_OF_YEAR) + dias);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		
		if(dayOfWeek == 1) {
			calendar.set(Calendar.DAY_OF_YEAR,calendar.get(Calendar.DAY_OF_YEAR) + 1);
			
			System.out.println(calendar.getTime());
		}else if(dayOfWeek == 7) {
			calendar.set(Calendar.DAY_OF_YEAR,calendar.get(Calendar.DAY_OF_YEAR) + 2);
			System.out.println(calendar.getTime());
		}
		else {
			calendar.set(Calendar.DAY_OF_YEAR,calendar.get(Calendar.DAY_OF_YEAR));
			System.out.println(calendar.getTime());
		}
	}}
		
		
		
		
	/*	
	 * 
	 * int dia = Calendar.SATURDAY;
		System.out.println(dia);
		if(dia == 7) {
			dia = Calendar.SATURDAY - 5;
			System.out.println(dia);
		//}
		//if(fechaHoy == Calendar.SATURDAY) {
			//return fechaHoy + 2;
		//}
		/*
		 * public class SimpleTesting { public static void main(String[] args) { Date dt
		 * = new Date(); System.out.println("Today:    "+dt); Calendar c =
		 * Calendar.getInstance(); c.setTime(dt); c.add(Calendar.DATE, 1); dt =
		 * c.getTime(); System.out.println("Tomorrow: "+dt); }
		 */
		/*
		 * int fechaa = Calendar.DATE; int diaas;
		 * 
		 * Calendar calendar = Calendar.getInstance();
		 * calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
		 * 
		 * System.out.println(calendar); //calendar.setTime(fechaa);
		 * 
		 * //calendar.set(Calendar.DAY_OF_YEAR,calendar.get(Calendar.DAY_OF_YEAR) +
		 * diaas);
		 * 
		 * if(Calendar.DAY_OF_YEAR == Calendar.SATURDAY) {
		 * 
		 * } else if(Calendar.DAY_OF_YEAR == Calendar.SUNDAY) {
		 * calendar.set(Calendar.DAY_OF_YEAR,calendar.get(Calendar.DAY_OF_YEAR) + (diaas
		 * + 1)); }
		 */
		
		


