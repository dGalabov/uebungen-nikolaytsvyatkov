package uebung2;

public class Bedingungen {
	public static void main(String[] args) {
		boolean anerkannt=true;
		if (anerkannt) {
			System.out.println("Hausarbeit anerkannt");
		}
		boolean zahlenGleich=20==10;
		if(zahlenGleich) {
			System.out.println("Gleiche Zahlen!");
		}else{
			System.out.println("Ungleiche Zahlen!");
		}
		int nummer=26;
		if(nummer<0) {
			System.out.println("Nummer ist positiv.");
		}else if(nummer<0) {
			System.out.println("Nummer ist negativ");
		}else {
			System.out.println("Nummer is null.");
		}
		
		double a=3.2;
		double b=5.7;
		double c=-4.8;
		double maxNummer;
		if(a>b) {
			if(a>c) {
				maxNummer=a;
			}else {
				maxNummer=c;
			}
		}else {
			if(b>c) {
				maxNummer=b;
			}else {
				maxNummer=c;
			}
		}
		System.out.print("Max Nummer ist:"+maxNummer);
	}

}
