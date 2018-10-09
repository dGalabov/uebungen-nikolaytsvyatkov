package uebung3;

import java.util.Scanner;

public class DreieckBerechnung {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double a, b, c;
		do {
			System.out.println("Eingabe von Dreiecksseiten:");
			a=input.nextDouble();
			b=input.nextDouble();
			c=input.nextDouble();
			boolean correct=(a>0)&&(b>0)&&(c>0)
					&&(a+b>c)&&(a+c>b)&&(b+c>a);
			if(correct) {
				double p=(a+b+c)/2;
				double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
				System.out.println("Flaeche:"+s);
				if(a==b&&b==c) {
					System.out.println("Flaeche:"+s);
					System.out.print("Das Dreeck ist:");
					if(a==b&&b==c) {
						System.out.println("gleichschenklig");
					}
				}
				
			}else {
				System.out.println("Die Werte sind nicht korrekt!");
			}
		}while (a>0&&b>0&&c>0);

	}
}
