class Driver{

	public static void main(String args[]){
		
		Solution sol = new Solution();
		
		int[] arr = {0,1,2,2,3,0,4,2};
		
		int res = sol.removeElement(arr, 2);
		
		for(int i = 0; i < res; i++){
			
			System.out.println(arr[i]);
		}
	}
}