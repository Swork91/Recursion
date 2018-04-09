import java.util.Scanner;

public class ComputerFactorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = 0;
		while (n != -1) {
			System.out.println("Enter a number: ");
			n = input.nextInt();
			
			if (n>=0) {
				System.out.println("Factorial of "+n+" is "+factorial(n));
			}
			else {
				System.out.println("\ngoodbye");
			}

		}


	}

	private static long factorial(int n) {
		if (n<2) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}

}

