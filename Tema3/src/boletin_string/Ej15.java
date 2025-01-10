package boletin_string;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase1 = "";
		String frase2;
		System.out.println("Introduce frase");
		frase1 = sc.nextLine().toLowerCase();
		System.out.println("Introduce frase");
		frase2 = sc.nextLine().toLowerCase();
		System.out.println(pista(frase1));
		System.out.println(anagrama(frase1, frase2));
	}

	static boolean anagrama(String palabra1, String palabra2) {
		boolean esAnagrama = true;
		int i = 0;
		while (i < palabra2.length() && esAnagrama) {
			palabra1.indexOf(palabra2.charAt(i));
			if (palabra1.indexOf(palabra2.charAt(i)) == -1) {
				esAnagrama = false;
			}
			i++;
		}
		return esAnagrama;
	}
	static String pista(String texto) {
		String pista="";
		for (int i=0;i<texto.length()/2;i++) {
			pista+=texto.charAt((int)Math.random()*(texto.length()-1));
		}
		return pista;
	}

}
