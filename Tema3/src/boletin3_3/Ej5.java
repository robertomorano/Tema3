package boletin3_3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		String palabra;
		LinkedHashSet<String> palabras =new LinkedHashSet<>();
		// crear escaner
		Scanner sc = new Scanner(System.in);
		System.out.println("Plabra ya");
		palabra=sc.next();
		while(palabra.equals("fin")) {
			palabras.add(palabra);
			System.out.println("Plabra ya");
			palabra=sc.next();
		}
	}

}
