package uebung4;

public class Numberfinder {
	public static void main(String[] args) {
		printPrimeCount(1,10_000);
		printPalindromicPrimes(10);
		printEmirps(10);
	}
	
	static void printPrimeCount(int fromNumber,int toNumber) {
		int primeCount=0;
		for(int number=fromNumber;number<toNumber;number++) {
			if(Numbers.isPrime(number)) {
				primeCount++;
			}
		}
		System.out.println(primeCount);
	}
	static void printPalindromicPrimes(int expectedCount) {
		int foundCount=0;
		int nextNumber=1;
		while(foundCount<expectedCount) {
			if(Numbers.isPrime(nextNumber)&&Numbers.isPalindrome(nextNumber)) {
				System.out.print(nextNumber+" ");
				foundCount++;
			}
			nextNumber++;
		}
		System.out.println();
	}
	static void printEmirps(int expectedCount) {
		int foundCount=0;
		int nextNumber=0;
		do {
			nextNumber++;
			if(Numbers.isPalindrome(nextNumber)) {
				continue;
			}
			int reversedNumber=Numbers.reverse(nextNumber);
			if(Numbers.isPrime(nextNumber)&&Numbers.isPrime(reversedNumber)) {
				System.out.print(nextNumber+" ");
				foundCount++;
			}
		}while(foundCount<expectedCount);
		System.out.println();
	}
}
