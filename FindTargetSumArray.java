

class FindTargetSumArray{
	
	public static void main(String[] args){
		
		int[] arrayin = {2,7,11,15};
		int num = 9;
		int[] values = targetSumArray(arrayin,num);
		System.out.println("["+values[0]+","+values[1]+"]");
	}
	static int[] targetSumArray(int[] values,int num){
		
		int[] arrayno = new int[2];
		for(int i =0 ;i<= values.length;i++){
			for(int j=i+1;j<= values.length;i++){
				if(values[i]+values[j] == num){
					arrayno[0] = i;
					arrayno[1] = j;		
					return arrayno;
				}
			}
		}
		
		return arrayno;	 
		
	}
	
}