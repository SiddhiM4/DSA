import java.util.Scanner;

public class BubbleSort {
	public static boolean BSort(int arr[], int n) {
		int flag=0;
		boolean arraySortedAlready = true;
		for(int i = 0;i < n;i++) {
			flag=0;
			for(int j = 0;j < n-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag=1;
					arraySortedAlready=false;
				}
			}
			if(flag==0) {
				break;
			}
		}
		return arraySortedAlready;
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
		boolean sortedArray = BSort(arr,n);
		if(sortedArray)
			System.out.println("Array Sorted Already!!");
		else 
		{
			BSort(arr,n);
			System.out.println("Sorted Array");
			for(int i = 0;i<n;i++)
				System.out.print(arr[i]+" ");
		}
	}
}