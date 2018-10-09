package uebung3;

import java.util.Scanner;

public class WinkelAbmessung {
	public static void main(String args) {
		Scanner input = new Scanner(System.in);
		double winkel;
		char einheit;
		do {
			System.out.print("Winkeleingabe:");
			winkel = input.nextDouble();
			System.out.print("Einheiteingabe:");
			String symbole = input.next();
			einheit = symbole.charAt(0);
			if (einheit == 'r') {
				double neuWinkel = winkel / Math.PI * 180;
				System.out.println("Winkel:" + neuWinkel + "g");
			} else if (einheit == 'g') {
				double neuWinkel = winkel * Math.PI / 180;
				System.out.println("Winkel:" + neuWinkel + "r");
			}

		} while (einheit == 'g' || einheit == 'r');
	}

}
