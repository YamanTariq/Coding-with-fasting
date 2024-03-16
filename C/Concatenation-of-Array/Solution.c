//Without a doubt one of the easiest problems ive ever done
//would reccomend this to a 1st sem student who has just learned
//passing by reference and pointers

int* getConcatenation(int* nums, int numsSize, int* returnSize) {

    *returnSize = numsSize * 2;

    int *result = malloc(sizeof(int) * (numsSize * 2));

    //copy values
    for(int i = 0; i < numsSize; i++){
        result[i] = nums[i];
        result[i + (numsSize)] = nums[i];
    }

    return result;
}
