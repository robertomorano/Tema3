package boletin1;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// inicializacion del array
		int numeros[]=new int [10];
		//variable de paso
		int valor=0;
		Scanner sc = new Scanner(System.in);
		//REcorrer el array mientras se piden valores
		for (int i=0;i<numeros.length;i++) {
			System.out.println("introduzca un valor");
			numeros[i]=sc.nextInt();
		}
		//for distinto para mostrar valores
		for (int i=numeros.length-1;i>=0;i--){
			System.out.print(numeros[i]+" ");
		}

	}

}
