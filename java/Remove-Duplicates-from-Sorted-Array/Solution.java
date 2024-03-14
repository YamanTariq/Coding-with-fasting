//My solution: i saw the tags for the problem and saw the 'two pointers' so
//I thought of a solution with that in mind. First, learning from the previous
//problem, I wrote the solution on a paper by initially manually writing a test
//array and then drawing two arrows (as pointers) and then thinking of when
//and how will i move them forward. This enabled me to write the solution
//in one go and getting all test cases passed on the first try.


class Solution {

	public int removeDuplicates(int[] nums) {
		
		//make two pointers to solve this
		int tail = 0;
		int head = 1;
		int length = nums.length;
		
		//if the array has only 1 number, return 1
		if(length == 1)
			return 1;
		
		//loop over all elements of the array
		for(head = 1; head < length; head++){
			
			//if the value headptr is different to value of tailptr do the following
			if(nums[tail] != nums[head]){
				tail++;
				nums[tail] = nums[head];
				continue;
			}
			
		}
		
		return tail + 1;
		
    }
}   