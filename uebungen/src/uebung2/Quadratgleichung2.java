package uebung2;
import java.util.Scanner;
public class Quadratgleichung2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Geben Sie Die Werte fuer a, b und c ein:");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		if(a!=0) {
			double diskriminante=b*b-4*a*c;
			if(diskriminante>=0) {
				double wurzel=Math.sqrt(diskriminante);
				double x1=(-b+wurzel)/(2*a);
				double x2=(-b+wurzel)/(2*a);
				System.out.println("x1="+x1+",x2="+x2);
			}else {
				System.out.println("Imaginiare Werte");
			}
		}else if(b!=0) {
			double x=-c/b;
			System.out.println("x="+x);
		
		}else if(c!=0) {
			System.out.println("Keine Werte");
		}else {
			System.out.println("Viele Werte");
		}
	}

}
