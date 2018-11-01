package br.com.cursojava;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ExemploDateFormat {

	public static void main(String[] args) throws ParseException {

//		 
//		String data = "31/10/2018 16:35:40";
//		DateFormat dataFormatada = DateFormat.getDateTimeInstance();
//		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
//
//		System.out.println(df.format(new Date()));
//		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
//		System.out.println(df.format(new Date()));
//
//		df = DateFormat.getDateInstance(DateFormat.SHORT);
//		System.out.println(df.format(new Date()));
//
//		Date recebeDataFormatada = null;
//		recebeDataFormatada = dataFormatada.parse(data);
//		System.out.println(recebeDataFormatada);

		Calendar c = Calendar.getInstance();
//		c.set(2013, Calendar.FEBRUARY, 28);
		Date data = c.getTime();
		System.out.println("Data atual sem formatação: " + data);

		// Formata a data
		DateFormat formataData = DateFormat.getDateInstance();
		System.out.println("Data atual com formatação: " + formataData.format(data));

		// Formata Hora
		DateFormat hora = DateFormat.getTimeInstance();
		System.out.println("Hora formatada: " + hora.format(data));

		// Formata Data e Hora
		DateFormat dtHora = DateFormat.getDateTimeInstance();
		System.out.println(dtHora.format(data));

	}

}
