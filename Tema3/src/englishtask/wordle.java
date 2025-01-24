package englishtask;

import java.util.Scanner;

public class wordle {
	//Array of strings to guess
	static final String WORDS[] = {"alpha", "trump","train","based","sigma"};
	
	//Select the random word
	static String theWord = selectWord();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userInput="";
		final int ATTEMPS = 6;
		int cont = 0;
		String result;
		boolean correct = false;
		//
		
		System.out.println("Introduce a word of 5 letters");
		//
		userInput=sc.nextLine();
		
		result = buildOutput(userInput);
		
		System.out.println(result);
		
		while (cont < ATTEMPS && !correct ) {
			
			System.out.println("Introduce a word of 5 letters");
			userInput=sc.nextLine();
			
			result = buildOutput(userInput);
			System.out.println(result);
			if (result.equalsIgnoreCase(theWord)) {
				correct = true;
			} else {
				cont++;
			}
		}
		
		System.out.println("You win!!!");
		
	}
	static String selectWord() {
		int index=(int)(Math.random()*WORDS.length);
		String wordSelected = WORDS[index];
		return wordSelected;
	}
	
	public static String buildOutput(String userWord) {
		String result = "";
		
		for (int i = 0; i < userWord.length(); i++) {
			if (userWord.charAt(i) == theWord.charAt(i)) {
				result += userWord.charAt(i);
			}
			else if (theWord.indexOf(userWord.charAt(i)) < 0) {
				result += "_";
			}
			else {
				result += "*";
			}
		}
		
		return result;
	}
}
