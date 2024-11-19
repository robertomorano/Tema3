package boletin4;

import java.util.Arrays;
import java.util.Scanner;

public class Ej41 {
	static int buscar(int t[], int clave){
		int cont=0;
		int indices[];
		for(int j =0;j<t.length;j++) {
			//Cambiar valor matriz
			t[j]=(int) ((Math.random()*10+1));
			//Usando el tabulador le doy forma a la tabla
			System.out.print(t[j]+" \t");
			if (clave==t[j]) {
			cont++;
			}
		}
		if (cont>0) {
			
		}else {
			cont=-1;
		}
		return cont;
	}

	public static void main(String[] args) {
		int matriz[];
		int logitud;
		int clave=0;
		//iniciar escaner
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una longitud");
		logitud=sc.nextInt();
		System.out.println("Introduce una longitud");
		clave=sc.nextInt();
		matriz = new int [logitud];
		clave=buscar(matriz, clave);
		System.out.println("Se ha encontrado: "+clave);
	}
}
