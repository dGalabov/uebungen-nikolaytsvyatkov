package uebung3;

import java.util.Scanner;

public class Nummernsuche {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberCount = 1;
		for (int number = 100; number <= 1000; number++) {
			if (number % 5 == 0 && number % 6 == 0) {
				if (numberCount % 10 == 0) {
					System.out.println(number);
				} else {
					System.out.print(number + " " );

				}
				numberCount++;
			}
		}
	}

}
