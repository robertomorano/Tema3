package boletin3;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		//Crear e inicializar la tabla
		int matriz[][]= new int[10][10];
		//for anidado para recorrer la tabla
		for(int i=0; i<matriz.length;i++) {
			System.out.println("Tabla del: "+ (i+1));
			for(int j =0;j<matriz[i].length;j++) {
				//Cambiar valor matriz
				matriz[i][j]= (i+1)*(j+1);
				System.out.println((i+1)+" * "+(j+1)+" = "+matriz[i][j]+" ");
			}
		}
	}

}
