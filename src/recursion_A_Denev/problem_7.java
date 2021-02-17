package recursion_A_Denev;

import java.util.Scanner;

public class problem_7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(gcd(a,b));
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
