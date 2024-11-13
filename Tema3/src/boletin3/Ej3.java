package boletin3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		//Crear e inicializar la tabla
		int matriz[][];
		//Dimensiones
		int ejeX=0;
		int ejeY=0;
		//iniciar escaner
		Scanner sc = new Scanner(System.in);
		//pedir dimensiones
		System.out.println("Dame el eje y de la tabla a crear");
		ejeY=sc.nextInt();
		System.out.println("Dame el eje x de la tabla a crear");
		ejeX=sc.nextInt();
		//inicializar matriz
		matriz = new int[ejeY][ejeX];
		//for anidado para recorrer la tabla
		for(int i=0; i<matriz.length;i++) {
			for(int j =0;j<matriz[i].length;j++) {
				//Cambiar valor matriz
				matriz[i][j]= (10*i)+j;
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}

	}

}
