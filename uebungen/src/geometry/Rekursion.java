package geometry;

public class Rekursion {
	public static void main(String[] args) {
		System.out.println("Factorial"+factorial(5));
		System.out.println("Factroail recursive: "+factorialRecursive(5));
		System.out.println("Fibonacci: "+fibonacci(12));
		System.out.println("Fibonacci recursive: "+fibonacciRecursive(12));
		
	}
	private static int factorial(int n) {
		int result=1;
		for(int number=2;number<=n;number++) {
			result*=number;
		}
		return result;
	}
	private static int factorialRecursive(int n) {
		if(n<2) {
			return 1;
		}else {
			return n*factorialRecursive(n-1);
		}
	}
	private static int fibonacci(int n) {
		int first=0,second=1;
		while(n>1) {
			second=first+second;
			first=second-first;
			n--;
		}
		return first;
		
	}
	private static int fibonacciRecursive(int n) {
		if(n<=1) {
			return 0;
		}else if(n==2) {
			return 1;
		}else {
			return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
		}
	}
}
