package boletin_string;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase1= "";
		System.out.println("Introduce una frase");
		frase1=sc.nextLine();
		frase1=invertir(frase1);
		System.out.println("La frase "+ frase1 + " la invertida");
		sc.close();
	}
	static String invertir(String cadena) {
		String invertida="";
		for(int i=cadena.length()-1;i>=0;i--) {
			invertida += cadena.charAt(i);
		}
		return invertida;
	}
}
