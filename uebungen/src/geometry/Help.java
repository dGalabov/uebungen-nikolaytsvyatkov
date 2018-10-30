package geometry;

import java.util.Scanner;

public class Help {
	public static final Scanner INPUT = new Scanner(System.in);
	public static double EPSILON = 1e-4;

	public static boolean equal(double x, double y) {
		return Math.abs(x - y) < EPSILON;
	}
}
