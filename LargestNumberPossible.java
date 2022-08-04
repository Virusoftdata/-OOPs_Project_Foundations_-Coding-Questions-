
import java.util.Scanner;

class LargestNumberPossible{
	
	public static void main(String[] args){
		//Scanner in = new Scanner(System.in);
		//int num = in.nextInt();
		int[] num = {2, 30, 56};
		System.out.println(intArrayToLargeValue(num));
		//System.out.println(numberSwapR(65));
		
	}
	public static int intArrayToLargeValue(int[] arry){
			int result = 0;
			for (int i = 0; i <arry.length; i++) { 
			  for (int j = i+1; j <arry.length; j++) {     
				  if(checkGraterValue(arry[i],arry[j])) {    
					int temp =  arry[i];    
					 arry[i] = arry[j];    
					 arry[j] = temp;  
				   }   
				}        
			}
			StringBuilder builder = new StringBuilder();
			if(checkZero(arry)){
			  for (int num : arry) {
			      builder.append(num);
			  }
			}else{
					
			   builder.append(0);
			}
					  result = Integer.parseInt(builder.toString());
		return result;
		
	}
	
	  public static boolean checkZero(int[] nums){
        
				  for (int i = 0; i < nums.length; i++)
					  {
						  if(nums[i] != 0)
						  {
							return true;
						  }
					  }
					  return false;
    }
    
	
	public static boolean checkGraterValue(int num1,int num2){
		String p = Integer.toString(num1);
        String q = Integer.toString(num2);
        String first = p + q;
        String second = q + p; 
		if(Integer.parseInt(first) >Integer.parseInt(second)){
			return false;
		}else{
			return true;
		}		
	}
	
	
	/*public static int numberSwap(int num){
		int result = 0;
		int temp = 0;
		while(num >0){
			
			
			int reminder = num%10;
			int resultremine =  result%10;
			
			System.out.println("Main Reminder:"+reminder);
						if(reminder >resultremine){
						
							System.out.println("Reesult Reminder:"+resultremine);
						     
								result = result/10;
								result = result*10+reminder;
								if(resultremine ==0){
									if( result >9){
									result = result*10;	}	
								}else{
									
									result = result*10+resultremine;
								}
								
								//
								System.out.println("Reesult Reminder:"+result);
							
						}else{
							
										result = result*10+reminder;
								
								
							   
						}
						
			
			num  = num/10;
			System.out.println(num);
			//num = ans;
			System.out.println("Reesult:"+result);
		}
		
		
		return result;
		
	}
	*/
	
	
}