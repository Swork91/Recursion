import java.util.Scanner;

public class ComputeFibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter that fibonacci number: ");
		
		int index = input.nextInt();
		
		System.out.println("fibonacci at "+index+" is "+fibonacci(index)+".");
	}

	private static long fibonacci(int index) {
		if (index == 0) {
			return 0;
		}
		else if (index==1){
			return 1;
		}
		else {
			return fibonacci(index-1)+fibonacci(index-2);
		}
	}
}

