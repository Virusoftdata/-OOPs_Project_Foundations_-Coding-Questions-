
import java.util.Scanner;
class PalindromUsingRecursion{
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		String input  = in.nextLine();
	System.out.println(checkPalindrom(input));
		
	}
	
	public static boolean checkPalindrom(String str){
					if(str.length() == 0 || str.length() == 1){
						
						return true;
					}
					if(str.charAt(0) == str.charAt(str.length()-1)){
						str = str.substring(1, str.length() - 1);
						return checkPalindrom(str);
					}else{
						return false;
					}							
		
	}


}