package boletin5;
import java.util.Scanner;

public class Conecta4 {
	static Scanner sc = new Scanner(System.in);
	static int SIZE = 9;
	static int board[][] = new int[SIZE][SIZE];
	static boolean ganar = false;
	static boolean empate = false;

	public static void main(String[] args) {
		while (!ganar || empate) {
			for (int i = 1; i <= 2; i++) {
				getDatos(i);

			}
		}

	}

	static void getDatos(int player) {
		int x = 0;
		System.out.println("Dame la posicion X");
		x = sc.nextInt();
		setOnBoard(x, player);
	}

	static void setOnBoard(int x, int player) {
		int y = 0;
		if ((board[x][SIZE - 1] == 0)) {
			while ((board[x][y] != 0))
				y++;
		} else {
			getDatos(player);
		}
		board[x][y] = (player % 2 == 0) ? 1 : 2;
		winCheck(x, y);
	}

	static void winCheck(int x, int y) {
		int row = 0;
		int column = 0;
		while (row < SIZE || column < SIZE) {

		}

	}

	static void adyacente(int x, int y) {
		boolean adyacente = false;

	}
}