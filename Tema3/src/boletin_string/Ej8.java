package boletin_string;

import java.util.Arrays;
import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase1 = "";
		String [] palabras;
		System.out.println("Introduce una frase");
		frase1 = sc.nextLine();
		palabras=new String[contarEspacios(frase1)];
		palabras=frase1.split(" ");
		Arrays.sort(palabras);
		System.out.println(Arrays.toString(palabras));
	}
	static int contarEspacios(String cadena) {
		int espacios = 0;
		for (int letra=0;letra <cadena.length();letra++){
			if (cadena.charAt(letra)==' ') {
				espacios++;
			}
		}
		return espacios;
	}
}
