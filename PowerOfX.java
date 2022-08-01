

import java.util.Scanner;
class PowerOfX{
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int n = in.nextInt();
		System.out.println(power(x,n));
		
	}
	static int power(int x, int n)
	{
		int dummy;
		if( n == 0)
			return 1;
		System.out.println(n);
		dummy = power(x, n / 2);
		System.out.println(n);
		System.out.println(dummy);
		if (n % 2 == 0)
			return dummy*dummy;
		
		else
			return x*dummy*dummy;
		
	   
	}
}