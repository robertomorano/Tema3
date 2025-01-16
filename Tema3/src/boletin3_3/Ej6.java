package boletin3_3;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Ej6 {

	public static void main(String[] args) {
		String palabra;
		TreeSet<String> arbolPalabras = new TreeSet<>();
		// crear escaner
		Scanner sc = new Scanner(System.in);
		System.out.println("Plabra ya");
		palabra = sc.next();
		while (palabra.equals("fin")) {
			arbolPalabras.add(palabra);
			System.out.println("Plabra ya");
			palabra = sc.next();
		}

	}
}