package recursion_A_Denev;

public class problem_3 {

	public static void main(String[] args) {
		leftToRight(1673);

	}
	public static void leftToRight(int n) 
	{
		if(n==0) 
		{
			return;
		}
		leftToRight(n/10);
		System.out.println(n%10);
	}

}
