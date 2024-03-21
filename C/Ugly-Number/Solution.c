bool isUgly(int n) {

    //if negative
    if(n <= 0){
        return false;
    }

    if(n == 1){
        return true;
    }

    int arr[3] = {2,3,5};
    int ptr = 0;

    while(ptr < 3){

        if(n % arr[ptr] == 0){
            n /= arr[ptr];
        }
        else{
            ptr++;
        }

    }

    if(n == 1){
        return true;
    }

    return false;
}
