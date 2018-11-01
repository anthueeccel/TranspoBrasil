package br.com.cursojava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploDate {

	public static void main(String[] args) throws ParseException {
		Date data = new Date();
		System.out.println("Data Agora: " + data);

		String dataUsuario = "20/10/2018 14:35:10";
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date dataFormatada = formato.parse(dataUsuario);
		System.out.println(dataFormatada);

		SimpleDateFormat dataAgora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(data);		
		dataFormatada = dataAgora.parse(data.toString());
		System.out.println(dataFormatada);

	}

}
