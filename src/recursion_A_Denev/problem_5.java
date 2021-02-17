package recursion_A_Denev;

import java.util.Scanner;

public class problem_5 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(print(n,1,10));
		scan.close();

	}
	public static int print(int n,int temp,int number) 
	{
		if(n == 1) 
		{
			return 10;
		}
		if(temp == n) 
		{
			System.out.println(number);
		} 
		if(temp < n) 
		{
			temp++;
			System.out.println(number);
			number *=10;
			print(n,temp,number); 
			
		}
		else if(n != 0) 
		{
			n--;
			System.out.println(number);
			number /=10;
			print(n,temp,number);
		}
		return 10;
	}

}
