package boletin4;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		int matriz[];
		int logitud;
		//iniciar escaner
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una longitud");
		logitud=sc.nextInt();
		matriz = new int [logitud];
		//for anidado para recorrer la tabla y darles un valor aleatorio
			for(int j =0;j<matriz.length;j++) {
				//Cambiar valor matriz
				matriz[j]=(int) (Math.random()*900+100);
				//Usando el tabulador le doy forma a la tabla
				System.out.print(matriz[j]+" \t");
			}
			System.out.println(suma(matriz));

		}
	static int suma(int n[]) {
		int resultado=0;
		for (int num:n) {
			resultado+=num;
		}
		return resultado;
		
	}
}
