class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        dic = {}
        for num in nums:
            if num in dic.keys():
                return True
            dic[num] = True

        return False 
