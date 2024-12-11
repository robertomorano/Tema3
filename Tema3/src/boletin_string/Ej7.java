package boletin_string;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase1 = "";
		String palabra = "";
		int cont =0;
		int index=0;
		System.out.println("Introduce una frase");
		frase1 = sc.nextLine();
		System.out.println("dame la palabra");
		palabra = sc.nextLine();
		frase1.replace(" ", "");
		index=frase1.indexOf(palabra, index);
		while (index<frase1.length()-palabra.length()&&(index>=0)) {
			cont++;
			index=frase1.indexOf(palabra, index);
			
		}
		System.out.println(cont);
	}

}
