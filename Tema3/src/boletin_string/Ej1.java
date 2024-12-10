package boletin_string;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase1= "";
		String frase2= "";
		System.out.println("Introduce una frase");
		frase1=sc.nextLine();
		System.out.println("Introduce una frase");
		frase2=sc.nextLine();
		System.out.println((frase1.length()>frase2.length()?"Mas larga la 1":"Mas larga la 2"));
		sc.close();
	}

}
