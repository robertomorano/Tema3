package boletin4;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int matriz[];
		int logitud;
		//iniciar escaner
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una longitud");
		logitud=sc.nextInt();
		matriz = new int [logitud];
		matriz=rellenaPares(matriz);
		System.out.println(Arrays.toString(matriz));
	}
	static int[] rellenaPares(int t[]){
		for(int j =0;j<t.length;j++) {
			//Cambiar valor matriz
			t[j]=(int) ((Math.random()*100))*2;
			//Usando el tabulador le doy forma a la tabla
			System.out.print(t[j]+" \t");
		}
		return t;
	}

}
