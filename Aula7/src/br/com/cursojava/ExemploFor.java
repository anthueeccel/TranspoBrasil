package br.com.cursojava;

public class ExemploFor {
	
	public static void main(String[] args) {
		
		System.out.println("Exemplo FOR 1");		
		//for(bloco inicialização; bloco comparação:true/false; bloco incremento/controle)
		for(int index = 0; index <= 10;index++) {
			//corpo da função "for"
			System.out.printf("%d ",index);			 
		}		
		
		System.out.print("\nExemplo FOR 2 \n");		
		int i = 10;
		for( ; i>=0 ;i--) {
			System.out.printf("%d ", i);
		}
		
		
		System.out.println("\nExemplo FOR 3");		
		for(;i<=10;) {
			System.out.printf("%d ", i);
			i++;
		}
		System.out.println("\nExemplo FOR 4");
		
		
		for (;;) {
			System.out.printf("%d ", i);
			i--;
			if( i <= 0) 
				break;			
		}
		System.out.println("Fim da Aplicação");
		
		
	}

}
