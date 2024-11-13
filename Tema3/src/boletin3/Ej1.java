package boletin3;

import java.util.Arrays;

public class Ej1 {

	public static void main(String[] args) {
		int matriz[][];
		matriz = new int [3][6];
		matriz[0][0]=0;
		matriz[0][1]=30;
		matriz[0][2]=2;
		matriz[0][5]=5;
		matriz[1][0]=75;
		matriz[1][4]=0;
		matriz[2][2]=-2;
		matriz[2][3]=9;
		matriz[2][5]=11;
		System.out.println(Arrays.deepToString(matriz));
	}

}
