package br.com.cursojava;

public class ExemploString {
	
	public static void main(String[] args) {
		
		String curso = "Java Web TranspoBrasil";
		
		//length() retorna a quantidade de carcteres
		System.out.println(curso.length());
		//charAt retorna o caracter em uma posição específica
		for (int posicao = 0; posicao < curso.length(); posicao++) {
			System.out.println(curso.charAt(posicao));
			}
		
		// indexOf() retorna o indice (posiçao) da String
		System.out.println(curso.indexOf("web"));
		System.out.println(curso.indexOf("a", 4)); //define a partir de qual posição procurar o caracter
		
		// pesquisa todas as posições que contém "a"
		int pos = -1;
		do { 
			pos++;
			pos = curso.indexOf('a', pos);
			System.out.print("pos");
			
		} while (pos != -1);
		
		
		String a = "bola";
		System.out.println(a.replace('a', 'b'));
		System.out.println(a);
		String b = "bola";
		String c = new String ("bola");
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(c));
		
		// substring retorna uma parte da String
		System.out.println(curso.substring(10));
		System.out.println(curso.substring(0, 5));
		
		
	}

}
