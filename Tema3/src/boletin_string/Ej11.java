package boletin_string;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase1 = "";
		String fraseCodifica = "";
		char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		System.out.println("Introduce frase");
		frase1 = sc.nextLine().toLowerCase();
		for (int i = 0; i < frase1.length(); i++) {
			fraseCodifica += codifica(conjunto2, conjunto1, frase1.charAt(i));
		}
		System.out.println(fraseCodifica);
	}

	static char codifica(char conjunto1[], char conjunto2[], char c) {
		String texto1 = "";
		char letra = c;
		int index = 0;
		for (int i = 0; i < conjunto1.length; i++) {
			texto1 += conjunto1[i];
		}
		index = texto1.indexOf(c);
		if (index >= 0) {
			letra = conjunto2[index];
		}
		return letra;
	}

}
