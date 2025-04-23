# Solution 1: O(n^2) time. nested loops
# Solution 2: O(nlog(n)) time. sorted and then solved in single loop
# Solution 3: O(n) time. used counting sort variation

class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        
        ''' 
        result = [0] * len(nums)
        for i in range(0,len(nums)):
            for j in range(0,len(nums)):
                if i != j:
                    if nums[i] > nums[j]:
                        result[i] += 1
        
        return result
        '''

        '''
        temp = sorted(nums)

        hash_map = {}
        for i,v in enumerate(temp):
            if v not in hash_map:
                hash_map[v] = i
        
        result = []
        for num in nums:
            result.append(hash_map[num])

        return result
        '''

        frequency = [0] * 101
        for num in nums:
            frequency[num] += 1
        
        cum_frequency = [0] * 101
        for i in range(1,101):
            cum_frequency[i] = cum_frequency[i-1] + frequency[i-1]
        
        result = []
        for num in nums:
            result += [cum_frequency[num]]

        return result




