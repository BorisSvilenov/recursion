package recursion_A_Denev;

import java.util.Scanner;

public class problem_4 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		rightToLeft(n);
		scan.close();

	}
	public static void rightToLeft(int n) 
	{
		if(n == 0) 
		{
			return;
		}
		else 
		{
			System.out.println(n%10);
			rightToLeft(n/10);
		}
		
		
	}

}
