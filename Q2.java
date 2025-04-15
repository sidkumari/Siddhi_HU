package Assignments;
import java.util.*;
// Find Smallest and largest element of an array
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		int smallest=Integer.MAX_VALUE; //initializing as Integers max value
		int largest=Integer.MIN_VALUE;  //initializing as Integers min value
		
		
		for(int i=0;i<10;i++) {
			if(arr[i]<smallest)
				smallest=arr[i];
			
			if(arr[i]>largest)
				largest=arr[i];
			
		}
		
		System.out.println("Smallest number: "+ smallest);
		System.out.println("Largest number: "+largest);

	}

}
