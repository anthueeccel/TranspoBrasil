package br.com.cursojava;

/*Dado que um ve�culo percorre uma dist�ncia de 200km em 240min calcule a velocidade m�dia em km/h.*/

public class Set11Exerc4 {
	public static void main(String[] args) {
		int dist = 200;
		int tempoHora = 240/60;
		double velocMedia = dist/tempoHora;
		
		System.out.printf("A velocidade m�dia de um ve�culo que percorre %d km em %d minutos � de %.1f km/hora", dist, tempoHora, velocMedia);
	}

}
