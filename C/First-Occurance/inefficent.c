//this is the inefficient method
//without using the two pointer method.



int strStr(char* haystack, char* needle) {

    int len = strlen(needle);
    int len2 = strlen(haystack);

    for(int i = 0; (i + len) <= len2 ; i ++){

        char *temp = malloc(sizeof(char) * (len + 1));
        strncpy(temp, haystack + i, len + 1);
        temp[len] = '\0';

        if (strcmp(needle, temp) == 0){
            free(temp);
            return i;
        }
        free(temp);
    }


    return -1;
}
