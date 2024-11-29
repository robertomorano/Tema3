package boletin5;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Creacion de tablero todo inicializado a 0
		final int LONGITUD = 8;
		int matriz[][] = new int[LONGITUD][LONGITUD];
		char pieza;
		// variable para la posicion
		int posX;
		int posY;
		// Pedir al usuario que pieza quiere mover y en que posicion esta
		System.out.println("Que pieza quiere mover");
		pieza = sc.next().charAt(0);
		System.out.println("En que posicion se encuentra eje x");
		posX = sc.nextInt();
		System.out.println("En que posicion se encuentra eje y");
		posY = sc.nextInt();

		switch (pieza) {
		case 'T':
			matriz = torre(posX, posY, pieza);
			break;
		case 'A':
			matriz = alfil(posX, posY, pieza);
			break;
		case 'D':
			matriz = reina(posX, posY, pieza);
			break;
		case 'C':
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + pieza);
		}
		imprimir(posX, posY, matriz, pieza);
	}

	static void imprimir(int posX, int posY, int tablero[][], char pieza) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if (tablero[i][j] == 0) {
					System.out.print("·\t");
				} else if (tablero[i][j] == 1) {
					System.out.print("X\t");
				} else {
					System.out.print(pieza + "\t");
				}
			}
			System.out.println();
		}
	}

	static int[][] torre(int posX, int posY, char pieza) {
		int movimiento[][] = new int[8][8];
		movimiento[posX][posY] = 2;
		for (int i = posX + 1; i < movimiento.length; i++) {
			movimiento[i][posY] = 1;
		}
		for (int j = posY + 1; j < movimiento.length; j++) {
			movimiento[posX][j] = 1;
		}
		for (int j = posY - 1; j >= 0; j--) {
			movimiento[posX][j] = 1;
		}
		for (int i = posX - 1; i >= 0; i--) {
			movimiento[i][posY] = 1;
		}
		return movimiento;
	}

	static int[][] alfil(int posX, int posY, char pieza) {
		int movimiento[][] = new int[8][8];
		movimiento[posX][posY] = 2;
		int sum = posY+1;
		for (int i = posX + 1; i < movimiento.length&&sum<movimiento.length; i++) {
				movimiento[i][sum] = 1;
				if (sum<=movimiento.length-1)
				sum++;
		}
		sum = posY-1;
			for (int i = posX - 1; i >= 0&& sum>=0; i--) {
				movimiento[i][sum] = 1;
				if(sum>1)
				sum--;
			}
			sum = posX-1;
			for (int j = posY + 1; j < movimiento.length&&sum>=0; j++) {
				movimiento[sum][j] = 1;
				if (sum<=movimiento.length-1)
				sum--;
		}
		sum = posX+1;
			for (int j = posY - 1; j >= 0&&sum<movimiento.length; j--) {
				movimiento[sum][j] = 1;
				if(sum>1)
				sum++;
			}
//		for (int j = posY - 1; j >= 0; j--) {
//				movimiento[j][j] = 1;}
//			for (int j = posY + 1; j < movimiento.length; j++) {
//				movimiento[j][j] = 1;
//			}
		return movimiento;
	}
	static int[][] reina(int posX, int posY, char pieza){
		int movimiento[][] = new int[8][8];
		movimiento[posX][posY] = 2;
		int sum = posY+1;
		for (int i = posX + 1; i < movimiento.length&&sum<movimiento.length; i++) {
				movimiento[i][sum] = 1;
				if (sum<=movimiento.length-1)
				sum++;
		}
		sum = posY-1;
			for (int i = posX - 1; i >= 0&& sum>=0; i--) {
				movimiento[i][sum] = 1;
				if(sum>1)
				sum--;
			}
			sum = posX-1;
			for (int j = posY + 1; j < movimiento.length&&sum>=0; j++) {
				movimiento[sum][j] = 1;
				if (sum<=movimiento.length-1)
				sum--;
		}
		sum = posX+1;
			for (int j = posY - 1; j >= 0&&sum<movimiento.length; j--) {
				movimiento[sum][j] = 1;
				if(sum>1)
				sum++;
			}
			for (int i = posX + 1; i < movimiento.length; i++) {
				movimiento[i][posY] = 1;
			}
			for (int j = posY + 1; j < movimiento.length; j++) {
				movimiento[posX][j] = 1;
			}
			for (int j = posY - 1; j >= 0; j--) {
				movimiento[posX][j] = 1;
			}
			for (int i = posX - 1; i >= 0; i--) {
				movimiento[i][posY] = 1;
			}
		return movimiento;
	}
	static int[][] caballo(int posX, int posY, char pieza){
		int movimiento[][] = new int[8][8];
		movimiento[posX][posY] = 2;
		int sumaMovX= posX+2;
		int sumaMovY= posY+1;
		//recorre con un for la suma de las posiciones de -2 a 2 sin pasar por 0
		for(int)
			for(int)
		if(sumaMovX<movimiento.length&&sumaMovY<movimiento.length)
			movimiento[sumaMovX][sumaMovY]=1;
		return movimiento;
	}
}
