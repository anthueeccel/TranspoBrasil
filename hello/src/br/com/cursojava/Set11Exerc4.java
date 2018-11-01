package br.com.cursojava;

/*Dado que um veículo percorre uma distância de 200km em 240min calcule a velocidade média em km/h.*/

public class Set11Exerc4 {
	public static void main(String[] args) {
		int dist = 200;
		int tempoHora = 240/60;
		double velocMedia = dist/tempoHora;
		
		System.out.printf("A velocidade média de um veículo que percorre %d km em %d minutos é de %.1f km/hora", dist, tempoHora, velocMedia);
	}

}
