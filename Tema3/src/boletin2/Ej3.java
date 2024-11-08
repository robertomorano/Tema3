package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// inicializacion del array
		int numeros[]=new int [30];


		Scanner sc = new Scanner(System.in);
		for (int i=0;i<numeros.length;i++) {
			numeros[i]=(int) (Math.random()*10);
		}
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
	}

}
