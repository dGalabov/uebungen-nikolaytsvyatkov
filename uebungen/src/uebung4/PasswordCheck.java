package uebung4;

import java.util.Scanner;

public class PasswordCheck {
	public static final Scanner INPUT = new Scanner(System.in);
	private static int MIN_LENGHT = 8;
	static int MIN_DIGITS_COUNT = 2;

public static void main(String[] args) {
	boolean passwordValid;
	do {
		System.out.print("Enter a password: ");
		passwordValid=isPasswordValid(INPUT.next());
	}while(!passwordValid);
	System.out.println("Password valid!");
	
	}
	private static boolean isPasswordValid(final String password) {
		if(password.length()<MIN_LENGHT) {
			return false;
		}
		int numberOfDigits=0;
		for (int index=0;index<password.length();index++) {
			final char nextSymbol=password.charAt(index);
			if(!Character.isLetterOrDigit(nextSymbol)) {
				return false;
			}
			if(Character.isDigit(nextSymbol)) {
				numberOfDigits++;
			}
		}
		return numberOfDigits>=MIN_DIGITS_COUNT;
	}

}
