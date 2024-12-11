package boletin_string;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase1 = "";
		String textoFinal = "";
		final String FIN = "fin";
		int idiceFin = 0;
		System.out.println("Introduce una frase");
		frase1 = sc.nextLine();

//		frase1=invertir(frase1);
//		System.out.println("La frase "+ frase1 + " la invertida");
		while (!frase1.toLowerCase().contains(FIN)) {
			textoFinal += frase1 + " ";
			frase1="";
			System.out.println("Introduce una frase");
			frase1 = sc.nextLine();
		}
//		idiceFin = textoFinal.toLowerCase().indexOf("fin");
//		System.out.println(textoFinal.substring(0, idiceFin));
		System.out.println(textoFinal);
		sc.close();

	}

}
