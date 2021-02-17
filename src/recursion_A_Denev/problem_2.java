package recursion_A_Denev;

import java.util.Scanner;

public class problem_2 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(sumOfDigits(n,0));
		scan.close();

	}
	public static int sumOfDigits(int n, int sum) 
	{
		sum = n%10;
		if(n == 0) 
		{
			return 0;
		}
		else 
		{
			return sum + sumOfDigits(n/10,sum);
		}
	}

}
