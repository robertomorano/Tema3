package boletin1;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// inicializacion del array
		double numeros[]=new double [5];
		Scanner sc = new Scanner(System.in);
		//REcorrer el array mientras se piden valores
		for (int i=0;i<numeros.length;i++) {
			System.out.println("introduzca un valor");
			numeros[i]=sc.nextDouble();
			
		}
		//for distinto para mostrar valores
		for (double i:numeros){
			System.out.println(i);
		}

	}

}
