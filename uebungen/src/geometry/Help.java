package geometry;

import java.util.Scanner;

public class Help {
	public static final Scanner INPUT = new Scanner(System.in);
	public static double EPSILON = 1e-4;

	public static boolean equal(double x, double y) {
		return Math.abs(x - y) < EPSILON;
	}

	public static double calculateDsitance(Point point1, Point point2) {
		double xDifference = point2.x - point1.x;
		double yDifference = point2.y - point1.y;
		return Math.sqrt(xDifference * xDifference + yDifference * yDifference);

	}

	public static boolean areCollinear(Point point1, Point point2, Point point3) {
		double results1 = point1.x * (point2.y - point3.y);
		double results2 = point2.x * (point3.y - point1.y);
		double results3 = point3.x * (point1.y - point2.y);
		return equal(results1 + results2 + results3, 0);

	}

	public static double calculateAngle(double b, double c, double a) {
		double sum = (b * b + c * c - a * a) / (2 * b * c);
		return Math.acos(sum);
	}
	public static double calculateLineCoefficient(Point point1,Point point2) {
		double xDifference=point2.x-point1.x;
		if(equal(xDifference,0)) {
			return Double.MIN_VALUE;
		}else {
			return(point2.y-point1.y)/xDifference;
		}
	}
}
