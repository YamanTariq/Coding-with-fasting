//This was also done using the two pointer method but I later learned
//that the code I wrote is VERY bad. This code couldh have been 
//written in ten lines and less while it took me about 40 lines
//Again, although I am repeating the same mistakes of writing
//a hell lot of if statements,and I am a little disappointed too xd,
//I do believe that if I continue to know my msitakes and learn from
//them i'll improve one day


class Solution {

	public int removeElement(int[] nums, int val) {
		
		//declare two pointers
		int head = 1;
		int tail = 0;
		int length = nums.length;
		
		if(nums.length == 1){
			
			if(nums[0] == val)
				return 0;
			
			return 1;
		}
		
		//traverse through array
		for(head = 1; head < length; head++){
			
			if(nums[tail] == val && nums[head] != val){
				int temp = nums[head];
				nums[head] = nums[tail];
				nums[tail] = temp;
			}
				
			if(nums[tail] == val && nums[head] == val){
				continue;
			}
			
			tail++;
			
		}

		if (length != 0 && nums[length -1] != val)
			return tail + 1;
		
		return tail;
	}
}

