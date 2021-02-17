package recursion_A_Denev;

import java.util.Scanner;

public class problem_1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(sum(n,0,0));
		scan.close();

	}
	public static int sum(int n, int i,int sum) 
	{
		if(n>0) 
		{
			if(n == 1) 
			{
				return 1;
			}
			if(i != n) 
			{
				i++;
				sum+=i;
				return sum(n,i,sum);
			}
			if(i == n) 
			{
				return sum;
			}
		}else 
		{
			if(n == -1) 
			{
				return -1;
			}
			if(i != n) 
			{
				i--;
				sum+=i;
				return sum(n,i,sum);
			}
			if(i == n) 
			{
				return sum;
			}
		}
		return sum;
		
	}

}
