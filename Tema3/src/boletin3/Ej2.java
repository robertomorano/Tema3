package boletin3;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		//Crear e inicializar la tabla
		double notas[][] = new double[4][5];
		double min=0;
		//Variable nota maxima y minima
		double max=0;
		//variable para la media
		double media=0;
		int cont=0;
		//iniciar escaner
		Scanner sc = new Scanner(System.in);
		//for anidado para recorrer la tabla
		for(int i=0; i<notas.length;i++) {
			System.out.println("Usuario:");
			for(int j =0;j<notas[i].length;j++) {
				//Pedir valores usuario
				System.out.println("Dame tus notas");
				notas[i][j]=sc.nextDouble();
			}
		}
		max=notas[0][0];
		min=notas[0][0];
		for(int i=0; i<notas.length;i++) {
			for(int j =0;j<notas[i].length;j++) {
				if (min >= notas[i][j]) {
					min = notas[i][j];
				}
				if (max <= notas[i][j]) {
					max = notas[i][j];
				}
				media+=notas[i][j];
				cont++;
			}
		}
		System.out.println("La nota maxima es: "+max+"\n La minima es: "+min+"\nLa media es: "+(media/cont));
	}

}
