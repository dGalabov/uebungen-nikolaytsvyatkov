package uebung5;
import java.util.Scanner;

public class FeldManipulationen {
	public static void main(String[] args) {
		int[] elemente=new int[5];
		eingabe(elemente);
		int maxElement=max(elemente);
		System.out.println("Max: "+maxElement);
		System.out.println("Index von Min:"+indexVonMin(elemente));
		int[] umgekehrtElemente=umkehren(elemente);
		ausgabe(umgekehrtElemente);
		int[] ohneDuplizierteElemente=duplikateEntfernen(elemente);
		ausgabe(ohneDuplizierteElemente);
	}
	private static void eingabe(int[] feld) {
		Scanner input=new Scanner(System.in);
		for(int index=0;index<feld.length;index++) {
			System.out.print("Element"+index+":");
			feld[index]=input.nextInt();
		}
	}
	public static void ausgabe(int[] feld) {
		for(int index=0;index<feld.length;index++) {
			System.out.print(feld[index]+"");
		}
		System.out.println();
	}
	private static int max(int[]feld) {
		int max=feld[0];
		for(int index=1;index<feld.length;index++) {
			if(feld[index]>max) {
				max=feld[index];
			}
		}
		return max;
	}
	private static int indexVonMin(int[] feld) {
		int minIndex=0;
				for(int index=1;index<feld.length;index++) {
					if(feld[minIndex]>feld[index]) {
						minIndex=index;
					}
					
				}
		return minIndex;
	}
	private static int[] umkehren(int[] feld) {
		int[] umgekehrtFeld=new int[feld.length];
		int next=0;
		for(int index=feld.length-1;index>=0;index--) {
			umgekehrtFeld[next]=feld[index];
			next++;
			
		}
		return umgekehrtFeld;
	}
	private static int lineareSuche(int[]feld,int element) {
		for(int index=0;index<feld.length;index++) {
			if(element==feld[index]) {
				return index;
			}
		}
		return -1;
	}
	private static int[] duplikateEntfernen(int[]feld) {
		int[] ohneDuplikate=new int[feld.length];
		int next=0;
		for(int index=0;index<feld.length;index++) {
			boolean nichtGefunden=lineareSuche(ohneDuplikate,feld[index])==-1;
			if(nichtGefunden) {
				ohneDuplikate[next]=feld[index];
				next++;
				
			}
		}
		return ohneDuplikate;
	}
}
