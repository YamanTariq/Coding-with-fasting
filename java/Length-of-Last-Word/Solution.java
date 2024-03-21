class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;

     
        //skip over spaces
        while(s.charAt(i) == ' ')
            i--;
        
        int len = i;

        while(len >= 0 && s.charAt(len) != ' '){
            len--;
        }

        return (i - len);
    }
}