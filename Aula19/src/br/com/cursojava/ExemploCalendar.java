package br.com.cursojava;

import java.util.Calendar;

public class ExemploCalendar {

	public static void main(String[] args) {
//
//		TimeZone.getDefault();
//		Locale.getDefault().getLanguage();
		Calendar outraData = Calendar.getInstance();
		Calendar calendario = Calendar.getInstance();
		// System.out.println(calendario.getTime());
		// configurar o ano par 2016.
		calendario.set(2016, 11, 20);
//		System.out.println(calendar.getTime());

		System.out.println(calendario.before(outraData));

		// adiciona 4 anos ao ano.
//		calendar.add(Calendar.YEAR, 4);
//		System.out.println(calendar.getTime());
//
//		// rola 30 dias pra frente, mantem o mês.
//		calendar.roll(Calendar.DATE, 30);
//		System.out.println(calendar.getTime());
//
//		// aumenta 3 horas na última hora.
//		calendar.roll(Calendar.SECOND, 10);
//		System.out.println(calendar.getTime());

		int hora = calendario.get(Calendar.HOUR_OF_DAY);

		if (hora <= 12) {
			System.out.println("Bom dia!");
		} else if (hora > 12 && hora < 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}

		Calendar c = Calendar.getInstance();
		System.out.println("Data/Hora atual: " + c.getTime());
		System.out.println("Ano: " + c.get(Calendar.YEAR));
		System.out.println("Mês: " + c.get(Calendar.MONTH));
		System.out.println("Dia do Mês: " + c.get(Calendar.DAY_OF_MONTH));

	}
}
