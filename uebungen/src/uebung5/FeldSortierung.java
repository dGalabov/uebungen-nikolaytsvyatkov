package uebung5;

import java.util.Arrays;

public class FeldSortierung {
	public static void main(String args) {
		int[] array1= {9,8,4,10,12,1};
		int[] array2= {9,8,4,10,12,1};
		int[] array3= {9,8,4,10,12,1};
		selectionSort(array1);
		bubbleSort(array2);
		Arrays.sort(array3);
		
		FeldManipulationen.ausgabe(array1);
		FeldManipulationen.ausgabe(array2);
		FeldManipulationen.ausgabe(array3);
	}
	private static void selectionSort(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<array.length;j++) {
				if(array[minIndex]>array[j]) {
					minIndex=j;
				}
			}
			int temp=array[minIndex];
			array[minIndex]=array[i];
			array[i]=temp;
			}
	}
	private static void bubbleSort(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-1;i++) {
				int next=j+1;
				if(array[j]>array[next]) {
					int temp=array[j];
					array[j]=array[next];
					array[next]=temp;
				}
			}
		}
	}

}
