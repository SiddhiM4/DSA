import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a=0,b=1;
		
		System.out.println("Enter N : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print(a+" ");
			int c = a + b;
			a = b;
			b = c;
		}
		
	}

}
