package pruebas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;

public class Festivos {

	public static void main(String[] args) {

		/*
		 * int dias = 30; //Date fecha;
		 * 
		 * Calendar calendar = Calendar.getInstance();
		 * calendar.setTimeZone(TimeZone.getTimeZone("GMT")); calendar.set(2022, 8, 26);
		 * 
		 * calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) +
		 * dias); int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		 * 
		 * int year = calendar.get(Calendar.YEAR);
		 * 
		 * ArrayList holiday = new ArrayList<Date>(); holiday.add(LocalDate.of(year, 1,
		 * 1)); // Año Nuevo holiday.add(LocalDate.of(year, 2, 5)); // Día de la
		 * Constitución Mexicana holiday.add(LocalDate.of(year, 3, 21));// Natalicio de
		 * Benito Juárez holiday.add(LocalDate.of(year, 4, 14));// Semana Santa
		 * holiday.add(LocalDate.of(year, 4, 15));// Semana Santa
		 * holiday.add(LocalDate.of(year, 5, 1)); // Día del Trabajo
		 * holiday.add(LocalDate.of(year, 9, 16));// Independencia de México
		 * holiday.add(LocalDate.of(year, 11, 2));// Día de Muertos
		 * holiday.add(LocalDate.of(year, 11, 20));// Revolución Mexicana
		 * holiday.add(LocalDate.of(year, 12, 12));// Día del Empleado Bancario
		 * holiday.add(LocalDate.of(year, 12, 25));// Navidad
		 * 
		 * LocalDate fechaNueva =
		 * calendar.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		 * 
		 * for (Object i : holiday) { if (fechaNueva.equals(i)) {
		 * calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + 1); }
		 * } dayOfWeek = calendar.DAY_OF_WEEK; if (dayOfWeek == 1) {
		 * calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + 1); }
		 * else if (dayOfWeek == 7) { calendar.set(Calendar.DAY_OF_YEAR,
		 * calendar.get(Calendar.DAY_OF_YEAR) + 2); } else {
		 * calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR)); }
		 * 
		 * System.out.println(calendar.getTime());
		 * }
		 */

		
		
		
		//parte 2
	

		int dias = 30;
		Calendar calendar = Calendar.getInstance();
		calendar.set(2022, 2, 16);
		System.out.println("Yo puse " + calendar.getTime());
		calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + dias);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		// System.out.println(dayOfWeek);
		System.out.println("despues de los 30 dias " + calendar.getTime());

		//int day = calendar.get(Calendar.DAY_OF_MONTH);
		// System.out.println(dayOfMonth);
		//int month = calendar.get(Calendar.MONTH);
		// System.out.println(month);
		int year = calendar.get(Calendar.YEAR);

		ArrayList holiday = new ArrayList<Date>();
		holiday.add(LocalDate.of(year, 1, 1)); //Año Nuevo
		holiday.add(LocalDate.of(year, 2, 5)); //Día de la Constitución Mexicana
		holiday.add(LocalDate.of(year, 3, 21));//Natalicio de Benito Juárez
		holiday.add(LocalDate.of(year, 4, 14));//Semana Santa
		holiday.add(LocalDate.of(year, 4, 15));//Semana Santa
		holiday.add(LocalDate.of(year, 5, 1)); //Día del Trabajo
		holiday.add(LocalDate.of(year, 9, 16));//Independencia de México
		holiday.add(LocalDate.of(year, 11, 2));//Día de Muertos
		holiday.add(LocalDate.of(year, 11, 20));//Revolución Mexicana
		holiday.add(LocalDate.of(year, 12, 12));//Día del Empleado Bancario
		holiday.add(LocalDate.of(year, 12, 25));//Navidad

		// System.out.println("mi lista de fechas "+holiday);

		// System.out.println("Como era "+calendar.getTime());
		// System.out.println("el localdate " + holiday.get(month));
		LocalDate fechaNueva = calendar.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		for (Object i : holiday) {
			// System.out.println("i " + i);
			// System.out.println(calendar.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
			// System.out.println(calendar.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString());
			// System.out.println(i.toString());
			// System.out.println(LocalDate.of(year, 11, 2));
			// System.out.println(calendar.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString())
			// == i.toString());
			// System.out.println("Como debe " +
			// calendar.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
			// System.out.println(calendar.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
			// != LocalDate.of(year, 11, 2));
			// System.out.println(holiday.get(7));
			// System.out.println(fechaNueva.equals(LocalDate.of(year, 11, 2)));
			// System.out.println(fechaNueva.equals(LocalDate.of(year, 11, 2)));
			if (fechaNueva.equals(i)) {
				// if (fechaNueva.equals(LocalDate.of(year, 11, 2))) { // lista
				calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + 1);
				System.out.println("aquii " + calendar.getTime());

			}
		}
		dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
System.out.println("asi quedo "+ dayOfWeek);
		if (dayOfWeek == 1) {
			calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + 1);
			System.out.println("domingo " + calendar.getTime());
		} else if (dayOfWeek == 7) {
			calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + 2);
			System.out.println("sabado " + calendar.getTime());
			// } else if (dayOfWeek ==
			// 2 || dayOfWeek == 3 || dayOfWeek == 4 || dayOfWeek == 5 || dayOfWeek == 6) {
			// calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR));
			// System.out.println("Finaaal " + calendar.getTime()); 
		} else {
			calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR));
			System.out.println("Final " + calendar.getTime());
		}
	}
}