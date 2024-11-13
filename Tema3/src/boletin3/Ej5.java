package boletin3;

public class Ej5 {

	public static void main(String[] args) {
		//Crear e inicializar la tabla
		int matriz[][]= new int[5][6];
		int suma=0;
		//Variable para guardar la suma total
		int sumaTotal=0;
		//for anidado para recorrer la tabla y darles un valor aleatorio
		for(int i=0; i<matriz.length;i++) {
			for(int j =0;j<matriz[i].length;j++) {
				//Cambiar valor matriz
				matriz[i][j]=(int) (Math.random()*900+100);
				//Usando el tabulador le doy forma a la tabla
				System.out.print(matriz[i][j]+" \t");
				suma+=matriz[j][i];
				sumaTotal+=suma;
			}
			System.out.println(suma);
			System.out.print("");
		}
		suma=0;
		//Recorrer columnas primero y solo mosttrar la suma al final de cada columna
		for(int i=0; i<matriz[0].length;i++) {
			for(int j =0;j<matriz.length;j++) {
				//Cambiar valor matriz
				suma+=matriz[j][i];
				sumaTotal+=suma;
			}
			System.out.println("");
		}
		System.out.print(sumaTotal/2);
	}

}
