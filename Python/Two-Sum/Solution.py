class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        '''
        for i in range(0,len(nums) - 1):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i,j]
        '''

        visited = {}
        for i in range(0,len(nums)):
            if nums[i] in visited:
                return [visited[nums[i]], i]

            visited[target - nums[i]] = i



'''
first solution takes O(n^2) times because of nested loop and checks for each element.
The second solution however, takes O(n) time and loops over the array, subtracts the current value from the target
and checks whether this value exists in the rest of the array.
'''
