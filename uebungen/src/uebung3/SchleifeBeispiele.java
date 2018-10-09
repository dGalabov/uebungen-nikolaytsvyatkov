package uebung3;

import java.util.Scanner;

public class SchleifeBeispiele {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b;
		do {
			System.out.println("Geben Sie zwei Zahlen ein:");
			a = input.nextInt();
			b = input.nextInt();
			System.out.println("Positive Zahlen ein:" + (a > 0 && b > 0));

		} while (a != 0 || b != 0);
		System.out.println("Geben Sie eine Zahl n(n>2) ein:");
		long number = input.nextLong();
		long divider = 2;
		boolean numberPrime = true;
		while (divider <= number / 2) {
			if (number % divider == 0) {
				numberPrime = false;
				break;
			}
			divider++;
		}
		System.out.println("Geben Sie Ihren Namen ein:");
		String name = input.next();
		for (int index = 0; index < name.length(); index++) {
			char letter = name.charAt(index);
			System.out.println("*" + letter + "*");
		}
	}

}
