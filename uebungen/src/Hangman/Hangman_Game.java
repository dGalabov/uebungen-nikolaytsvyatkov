package Hangman;
import java.util.Scanner;
import java.time.Duration;
public   class Hangman_Game {
	private static String[] words = {"chalga", "payner", "record", "java", "pain", "water" };
	private static String chosen_word = words[(int) (Math.random() * words.length)];
	private static String Guess = new String(new char[chosen_word.length()]).replace("\0", "*");
	private static int count = 0;
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		printRules();
		System.out.println("Enter a capital letter: ");
		UserInput();
		
	
	}
	protected static void UserInput() {
		while (count < 8 && Guess.contains("*")) {
			System.out.println("Guess any letter in the word");
			System.out.println(Guess);
			String guess = input.next();
			count++;
			hang(guess);
			hangmanImage();
			System.out.println("Mistakes: "+count);
		}
		input.close();
	
	}
	
	protected static void hang(String guess) {
		String newGuess= "";
		for (int i = 0; i < chosen_word.length(); i++) {
			if (chosen_word.charAt(i) == guess.charAt(0)) {
				newGuess += guess.charAt(0);
			} else if (Guess.charAt(i) != '*') {
				newGuess += chosen_word.charAt(i);
			} else {
				newGuess += "*";
			}
		}
		if (chosen_word.equals(Guess)) {
			count++;
			hangmanImage();
		} else {
			
			Guess = newGuess;
		}
		if (Guess.equals(chosen_word)) {
			System.out.println("Correct! You win! The word was " + chosen_word);
			System.out.println("You made "+count+" mistakes!");
		}

	}
	 protected static void printRules() {

	        System.out.println("Welcome to Hangman! These are the rules:\n" +
	                "You have 7 guesses to guess the word.\n" +
	                "The word is " + chosen_word.length() + " characters long.\n" +
	                "Get " +chosen_word.length() + " points before you run out of turns to win!\n" +
	                "Don't guess the same word twice!\n\n");
	    }
	
	protected static void hangmanImage() {
		if(count == 1) {
			System.out.println(" -------");
			System.out.println(" |     |");
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println("_|___");
		} if (count == 2) {
			System.out.println(" -------");
			System.out.println(" |     |");
			System.out.println(" |     O ");
			System.out.println(" | ");
			System.out.println(" | ");
			System.out.println("_|___");
		} if (count == 3) {
			System.out.println(" -------");
			System.out.println(" |     |");
			System.out.println(" |     O");
			System.out.println(" |     |");
			System.out.println(" | ");
			System.out.println("_|___");
		} if (count == 4) {
			System.out.println(" -------");
			System.out.println(" |     |");
			System.out.println(" |     O");
			System.out.println(" |    /|");
			System.out.println(" |   ");
			System.out.println("_|___");
		} if (count == 5) {
				System.out.println(" -------");
				System.out.println(" |     |");
				System.out.println(" |     O");
				System.out.println(" |    /|\' ");
				System.out.println(" |   ");
				System.out.println("_|___");
		} if (count == 6) {
			System.out.println(" -------");
			System.out.println(" |     |");
			System.out.println(" |     O");
			System.out.println(" |    /|\' ");
			System.out.println(" |     |");
			System.out.println("_|___");
		} if (count == 7) {
			System.out.println(" -------");
			System.out.println(" |     |");
			System.out.println(" |     O");
			System.out.println(" |    /|\' ");
			System.out.println(" |     |");
			System.out.println("_|___ / ");
		} if (count == 8) {
			System.out.println(" -------");
			System.out.println(" |     |");
			System.out.println(" |     O");
			System.out.println(" |    /|\' ");
			System.out.println(" |     |");
			System.out.println("_|___ / \'__");
			System.out.println("Game over :/ ");
			System.out.println("The word was: "+chosen_word+"\nThank you for playing!\nYou made "+count+" mistakes!");
		}
	}
	
	
}
