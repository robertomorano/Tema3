package boletin3_3;

import java.util.Scanner;
import java.util.TreeMap;

public class Ej7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String, String> diccionario= new TreeMap<>();
		int num =0;
		System.out.println("1 .Inserta palabra. Debe solicitar una palabra en español y su traducción al inglés.\r\n"
				+ "2 .Busca palabra. Pregunta por una palabra en español y devuelve su traducción en inglés.\r\n"
				+ "0 .Salir. Termina el programa.");
		num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("Palabra Español:");
			 diccionario.=sc.next();
			break;
		case 2:
			break;
		default:
			break;
		}
		
	}

}
