//this is a very basic solution for this
//a better more elegant way would have
//been using recursion


bool isPowerOfTwo(int n) {

    int sum = 1;

    while(sum < n/2 + 1){

        sum *= 2;
    }

    if(sum == n)
        return true;

    return false;

}
