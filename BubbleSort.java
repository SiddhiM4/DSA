import java.util.Scanner;

public class BubbleSort {
	public static void BSort(int arr[], int n) {
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Numbers : ");
		for(int i = 0; i < n;i++) {
			arr[i] = sc.nextInt();
		}
		BSort(arr,n);
		
		System.out.println("Sorted Array");
		for(int i = 0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
}
