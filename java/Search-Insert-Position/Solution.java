class Solution {
    public int searchInsert(int[] nums, int target) {
        
        //binary search
        int tail = 0;
        int head = nums.length - 1;
        int mid = 0; 

        while(tail <= head){

            mid = (head + tail) / 2;

            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target){
                tail = mid + 1;
            }
            else{
                head = mid - 1;
            }
        }
        
        if(mid == head)
            return mid + 1;

        return mid;
    }
}