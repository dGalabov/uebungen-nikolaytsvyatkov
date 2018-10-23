package uebung5;

public class FelderBiespiele {
	public static void main(String[] args) {
		int[] zahlen=new int[3];
		zahlen[0]=26;
		zahlen[2]=-12;
		for(int index=0;index<zahlen.length;index++) {
			System.out.println(zahlen[index]);
		}
		double[] ergebnisse=new double[2];
		ergebnisse[0]=4.2;
		ergebnisse[1]=-12;
		double sum=ergebnisse[0]+ergebnisse[1];
		System.out.println(sum);
		
		
		char[] name1= {'F','D','I','B','A'};
		char[]name2=name1;
		name2[1]='W';
		System.out.println(name1[1]);
		
	}
}
