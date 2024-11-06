package boletin1;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// inicializacion del array
		int numeros[]=new int [10];
		Scanner sc = new Scanner(System.in);
		//REcorrer el array mientras se piden valores
		for (int i=0;i<numeros.length;i++) {
			System.out.println("introduzca un valor");
			numeros[i]=sc.nextInt();
		}
		//for distinto para mostrar valores
		for (int i:numeros){
			System.out.print(numeros[i]+" ");
			//Añadir la palbra par o impar dependiendo si lo es o no
			if (i%2==0) {
				System.out.println("Par");
			}else {
				System.out.println("Impar");
			}
		}

	}

}
