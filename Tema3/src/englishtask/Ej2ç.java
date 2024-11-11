package englishtask;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2ç {

	public static void main(String[] args) {
		// Create array numbers
		int numbers[];
		int value = 0;
		int v;
		int y;
		// Take the number to change and the position
		String select;
		// Start Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me the size of array");
		value = sc.nextInt();
		numbers = new int[value];
		// take the value and the position
		System.out.println("Give me the value");
		v = sc.nextInt();
		System.out.println("Give me the iteration");
		y = sc.nextInt();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = v;
			v += y;
		}
		for (int i=0; i<numbers.length;i++) {
			System.out.println(numbers[i]+", ");
		}
		
	}
}
