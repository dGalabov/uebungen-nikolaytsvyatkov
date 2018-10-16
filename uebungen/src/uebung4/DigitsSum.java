package uebung4;

public class DigitsSum {
	public static void main(String[] args) {
		int firstSum=sumDigits(1234);
		int secondSum=sumDigits(567);
		System.out.println("First: "+firstSum);
		System.out.println("Second: "+secondSum);
		System.out.println("Year: "+sumDigits(2018));
	}
	private  static int sumDigits(int number) {
		int sum=0;
		while(number>0) {
			sum+=number%10;
			number/=10;
		}
		return sum;

	
	}

}
