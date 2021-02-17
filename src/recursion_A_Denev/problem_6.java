package recursion_A_Denev;

import java.util.Scanner;

public class problem_6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=scan.nextInt();
		}
		bubbleSort(arr,n);
		System.out.println(findElementInArray(arr,5,n));
		scan.close();
	}
	public static boolean findElementInArray(int[] arr,int k,int n)
	{
		if(n==0) 
		{
			return false;
		}
		if(arr[n-1]==k) 
		{
			return true;
		}
		return findElementInArray(arr,k,n-1);
	}
	public static void bubbleSort(int[] arr,int n) 
	{
		for(int i=0; i<n-1;i++) 
		{
			for(int j=0;j<n-i-1;j++) 
			{
				if(arr[j]>arr[j+1]) 
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
