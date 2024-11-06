package boletin1;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		// inicializacion del array
		int numeros[]=new int [100];
		//variable de la posicion N
		int n=0;
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<numeros.length;i++) {
			numeros[i]=(int) (Math.random()*100+1);
		}
		do {
		System.out.println("Dame una posicion del 1 al 100");
		n=sc.nextInt();
		}while(!(n>0&&n<100));
		System.out.println("Tu numero es "+numeros[n]);
	}

}
