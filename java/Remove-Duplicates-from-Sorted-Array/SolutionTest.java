public class SolutionTest{
	
	public static void main(String args[]){
		
		Solution sol = new Solution();
		
		int[] arr = {1,1,2,2,2,2,3};
		
		int res = sol.removeDuplicates(arr);
		
		for(int i = 0; i < res; i++){
			System.out.println(arr[i]);
		}
	
	
	}

}