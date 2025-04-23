class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        length = len(nums)
        result = []
        nums = set(nums)
        for i in range(1, length + 1):
            if i not in nums:
                result += [i]

        return result
