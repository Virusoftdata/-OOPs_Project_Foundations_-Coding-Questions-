
import java.util.Scanner;
class PowerOfXItretion{
	
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.println(powerCalculator(x,y));
		
	}
	
	static int powerCalculator(int x,int n){
		int result = x;
		for(int i=0;i<n-1;i++){
			  result = result*x;
			  System.out.println(result);
		}
		return result;
	}
	
}