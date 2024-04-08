import math;

class Solution:
    def isPowerOfThree(self, n: int) -> bool:

        if n <= 0:
            return False

        res =  round(math.log(n,3))
        print(res)
        if n == (3 ** res):
            return True
