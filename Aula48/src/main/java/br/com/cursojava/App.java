package br.com.cursojava;

import java.security.MessageDigest;

public class App {
	
	public static String valor;
	
	
	public static void main(String[] args) {	
		
		valor = "12345678";
	System.out.println(gerarHash(valor));			
		
		
		
	}
	
	public static String gerarHash(String valor){
		try{
		 MessageDigest digest = MessageDigest.getInstance("MD5");
		 byte[] valorMD5 = digest.digest(valor.getBytes("UTF-8"));
        
         StringBuffer sb = new StringBuffer();
         for (byte b : valorMD5){
                sb.append(Integer.toHexString((b & 0xFF) | 0x100).substring(1,3));
         }
         return sb.toString();
		}catch(Exception e){
			throw new IllegalArgumentException("Não foi possível converter o texto");
		}
	}


}
