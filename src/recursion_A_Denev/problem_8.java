package recursion_A_Denev;

import java.util.Scanner;

public class problem_8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++) 
		{
			a[i]=scan.nextInt();
		}
		int G=a[0];
		for(int i=0;i<n;i++) 
		{
			G=gcd(G,a[i]);
		}
		System.out.println(G);
		scan.close();
	

	}
	public static int gcd(int a, int b) 
	{
		if(b==0) 
		{
			return a;
		}
		return gcd(b,a % b);
	}

}
