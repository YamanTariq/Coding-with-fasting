//Trivial Solution: sort both strings and then compare

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sAr = s.toCharArray();
        char[] tAr = t.toCharArray();
        
        Arrays.sort(sAr);
        Arrays.sort(tAr);

        return Arrays.equals(sAr,tAr);
    }
}

