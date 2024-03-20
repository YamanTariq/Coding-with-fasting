//this solution uses the two pointers approach
//time: better than 100% users
//space: better than 70% users

//although the time and space usage
//varies a lot from time to time
//when you submit a solution on leetcode

int strStr(char* haystack, char* needle) {

    int needptr = 0;
    int length = strlen(needle);
    int haylength = strlen(haystack);

    for(int i = 0; i <= haylength; i ++){

        if(needptr == length){
            return (i - needptr);
        }

        //if the current element equals first letter
        if (haystack[i] == needle[needptr]){
            needptr++;
        }
        else{
            i -= needptr;
            needptr = 0;
        }

    }

    return -1;
}

