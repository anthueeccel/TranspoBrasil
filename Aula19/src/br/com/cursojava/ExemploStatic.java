//package br.com.cursojava;
//
//import java.util.Calendar;
//
//public class ExemploStatic {
//
//	public static void main(String[] args) {
//		Teste t1 = new Teste();
//		Teste t2 = new Teste();
//
//		System.out.println(t1.atributo);
//		System.out.println(t2.atributo);
//		System.out.println(t1.atributoStatic);
//		System.out.println(t2.atributoStatic);
//		System.out.println(Teste.atributoStatic);
//
//		t1.atributo = 10;
//		t2.atributo = 20;
//		t1.atributoStatic = 50; // variável é estática, não modifica. 
//
//		System.out.println(t1.atributo);
//		System.out.println(t2.atributo);
//		System.out.println(t1.atributoStatic);
//		System.out.println(t2.atributoStatic);
//		System.out.println(Teste.atributoStatic); // acessa diretamente pelo nome da classe.
//		
//		t1.oi();
////		t1.hello(); 
//		t2.oi(); 
////		t2.hello();
//		Teste.hello(); //correto usar nome da classe para chamr o método estático.
//		
//		//5 classes que usem métodos static
//		//3 classes usem padrão singleton metodos 
//		
//		Calendar calendario = ;
//
//	}
//}
