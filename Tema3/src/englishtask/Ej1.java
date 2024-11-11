package englishtask;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		// Create array numbers
		int numbers[] = new int[10];
		int value = 0;
		int v;
		int p;
		// Take tehe naumber to change and the position
		String select;
		// Start Scanner
		Scanner sc = new Scanner(System.in);
		do {
			// take the selection from the user
			System.out.println(
					"What do you choose: \n" + "a. Show values.\r\n" + "b. Introduce a value.\r\n" + "c. Exit.\r\n");
			select = sc.nextLine();
			if (select.equalsIgnoreCase("a")) {
				for (int val : numbers) {
					System.out.print(val+", ");
				}
			} else if (select.equalsIgnoreCase("b")) {
				System.out.println("Give me the value");
				v = sc.nextInt();
				System.out.println("Give me the position");
				p = sc.nextInt();
				Arrays.fill(numbers, p, p + 1, v);
			}
		} while (!(select.equalsIgnoreCase("c")));
	}
}
