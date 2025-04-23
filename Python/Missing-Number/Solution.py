class Solution:
    def missingNumber(self, nums: List[int]) -> int:
       
        '''
        nums.sort()
        length = len(nums)
        
        for i in range(0,length):
            if i != nums[i]:
                return i
        
        return length
        '''
        return sum(range(0, len(nums) + 1)) - sum(nums)
