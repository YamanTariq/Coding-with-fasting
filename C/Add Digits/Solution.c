int addDigits(int num) {

    long int res = num;

    //loop to check result greater than 10
    while(res >= 10){

        num = 0;
        long mult = 1;
        //loop to add digits
        while(res / mult > 0){
            num += (res / mult) % 10;
            mult *= 10;
        }

        res = num;

    }

    return res;
}
