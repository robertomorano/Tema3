package boletin_string;

import java.util.Iterator;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase1= "";
		int espacioCont=0;
		System.out.println("Introduce una frase");
		frase1=sc.nextLine();
		espacioCont=contarEspacios(frase1);
		System.out.println("La frase tiene "+ espacioCont+ " espacios");
		sc.close();
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
