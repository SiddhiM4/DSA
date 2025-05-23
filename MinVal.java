import java.util.Scanner;

public class MinVal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N : ");
		int n = sc.nextInt();
		int[] nos=new int[n];
		System.out.println("Enter Numbers : ");
		for(int i = 0; i < n;i++) {
			nos[i] = sc.nextInt();
		}
		int min= nos[0];
		for(int i =0;i<n;i++) {
			if(min>nos[i]) {
				min = nos[i];
			}
		}
		System.out.println("Minimum value is : "+min);
	}
}
