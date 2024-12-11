package boletin_string;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase1 = "";
		boolean palindroma = false;
		System.out.println("Introduce una frase");
		frase1 = sc.nextLine();
		frase1.replace(" ", "");
		palindroma = palindromo(frase1);
		System.out.println("Es " + palindroma);
	}

	static String invertir(String cadena) {
		String invertida = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			invertida += cadena.charAt(i);
		}
		return invertida;
	}

	static boolean palindromo(String cadena) {
		String fraseInv = "";
		boolean palindroma = true;
		fraseInv = invertir(cadena);
		System.out.println(fraseInv);
		int contInv = cadena.length()-1;
		while (contInv >= 0 && palindroma) {
			if (!(cadena.charAt(contInv) == fraseInv.charAt(contInv))) {
				palindroma = false;
			}
			contInv--;
		}
		return palindroma;
	}
}
