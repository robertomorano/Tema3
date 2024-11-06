package boletin1;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		int numeros[]=new int [10];
		//variable de paso
		int suma=0;
		//variable de comparacion
		int mayor=0;
		int menor=0;
		Scanner sc = new Scanner(System.in);
		//REcorrer el array mientras se piden valores
		for (int i=0;i<numeros.length;i++) {
			System.out.println("introduzca un valor");
			numeros[i]=sc.nextInt();
		}
		//for distinto para mostrar valores
		for (int i:numeros){
			System.out.print(i+" + ");
			suma +=i;
		}
		System.out.println("= "+ suma);
		mayor = numeros[0];
		menor = numeros[0];
		for (int i=1;i<numeros.length;i++) {
			if (numeros[i]>=mayor) {
				mayor=numeros[i];
			}else if(numeros[i]<menor){
				menor=numeros[i];
			}
		}
		System.out.println("El mayor es: "+mayor+" y el menor es: "+menor);
	}

}
