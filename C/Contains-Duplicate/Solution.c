
//TRIVIAL SOLUTION: although it works, it's very inefficient and gives TLE - O(n^2) time

bool containsDuplicate(int* nums, int numsSize) {

	for(int i = 0; i < numsSize; i++){
		for(int j = 0; j < numsSize; j++){
			if(nums[i] == nums[j] && i != j){
				return true;
			}
		}
	}
	return false;
}



