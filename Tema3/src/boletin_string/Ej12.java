package boletin_string;

import java.util.Scanner;

public class Ej12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase1 = "";
		String palabras[];
		String palabra;
		int grande = 0;
		System.out.println("Introduce frase");
		frase1 = sc.nextLine().toLowerCase();
		palabras = frase1.split(" ");
		grande = palabras[0].length();
		palabra = palabras[0];
		for (int i = 0; i < palabras.length; i++) {
			if (grande >= palabras[i].length()) {
				grande=palabras[i].length();
				palabra = palabras[i];
			}
		
		}
		System.out.println(palabra+" "+grande);
	}

}
