package boletin2;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// inicializacion del array
		int numeros[]=new int [1000];
		//variable de la posicion N
		int n=0;
		int cont=0;
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<numeros.length;i++) {
			numeros[i]=(int) (Math.random()*100+1);
		}
		do {
			System.out.println("Dame un numero del 1 al 100");
			n=sc.nextInt();
		}while(!(n>0&&n<100));
		for (int i=0;i<numeros.length;i++) {
			if (numeros[i]==n) {
				cont++;
			}
		}
		System.out.println(cont);
	}

}
