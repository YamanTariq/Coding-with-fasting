class Solution {
    public boolean isPalindrome(int x) {
        
        //negative numbers are not a palindrome
        if(x < 0) { return false;}

        int answer = x - reverse(x);

        return (answer == 0) ? true: false;
    }

    int reverse(int number){
        
        long result = 0;

        while(number > 0){            
            result += (number % 10);
            result *= 10;
            number /= 10;
        }
        
        result /= 10;
        return (int) result;
    }


}