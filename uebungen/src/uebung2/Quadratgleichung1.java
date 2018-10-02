package uebung2;


import java.util.Scanner;

public class Quadratgleichung1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Geben Sie die Werte fuer a, b und c ein:");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		
		double diskriminante=b*b-4*a*c;
		double wurzel=Math.sqrt(diskriminante);
		double x1=(-b+wurzel)/(2*a);
		double x2=(-b-wurzel)/(2*a);
		
		System.out.println("x1="+x1+",x2="+x2);
	
		
	}

}
