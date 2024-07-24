import java.lang.*;
import java.util.*;

public class task7{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int arr[]= {10, 20, 30, 40, 50};
		int found =0;
		System.out.print("Enter the search element: ");
		int n = scan.nextInt();
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==n) {
				System.out.println("\nThe element is found at index "+i);
				found=1;
				break;
			}
		}
		if(found==0) {
			System.out.println("Element not in the array");
		}
	}
}

