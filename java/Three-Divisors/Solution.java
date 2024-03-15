//this is the brute force method.
//the only "efficency" that I have tried to
//implement is that the loop only iterates to
//half the value of the orignal number


class Solution {
    public boolean isThree(int n) {
        
        int divisor = 1;
        for(int i = 1; i <= n/2 && divisor <= 3; i++){

            if (n % i == 0)
                divisor += 1;
        }

        if (divisor != 3)
            return false;
        
        return true;
    }
}