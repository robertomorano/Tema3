package boletin_string;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase1 = "";
		String fraseEspacios="";
		int index=0;
		final String JAVALIN = "javalin javalon";
		final String JAVALEN = "javalen len len";
		System.out.println("Introduce una frase");
		frase1 = sc.nextLine();
		if (frase1.startsWith(JAVALIN)) {
			fraseEspacios= frase1.substring(JAVALIN.length());
			fraseEspacios=fraseEspacios.trim();
		}else if (frase1.endsWith(JAVALEN)) {
			 fraseEspacios = frase1.substring(0, frase1.lastIndexOf(JAVALEN));
			 fraseEspacios=fraseEspacios.trim();
		}else {
			System.out.println("No pertenece al idioma");
		}
		System.out.println("Traduccion:");
		System.out.println(fraseEspacios);
	}

}
