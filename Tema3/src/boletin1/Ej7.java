package boletin1;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// inicializacion del array
		int numeros[]=new int [10];
		//Variable de logitud de la barra
		final int LONGITUDBARRA=10;
		Scanner sc = new Scanner(System.in);
		//REcorrer el array mientras se piden valores
		for (int i=0;i<numeros.length;i++) {
			System.out.println("introduzca un valor de temperatura para el mes "+ i+": ");
			numeros[i]=sc.nextInt();
		}
		for(int i:numeros) {
			System.out.println("Mes "+i);
			for (int j = 0;j<LONGITUDBARRA;j++){
				System.out.print("-");
			}
			System.out.println();
		}

	}

}
