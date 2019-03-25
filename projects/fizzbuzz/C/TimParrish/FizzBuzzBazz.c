#include <string.h>
#include <stdio.h>

char result[20];

void processUserInput(int passedNum){
    char convertedInt[20];
    int i = 0;
    for (i=1; i <= passedNum; i++){
        memset(result,0,strlen(result));
        memset(convertedInt,0,strlen(convertedInt));

        if (i%3==0 || i%5==0 || i%7==0){
            if (i%3 == 0){
                strncat(result, "Fizz", 4);
            }
            if (i%5 == 0){
                strncat(result, "Buzz", 4);
            }
            if (i%7==0){
                strncat(result, "Bazz", 4);
            }
        }
        else{
            sprintf(convertedInt, "%d", i);
            strncat(result, convertedInt, 20);
        }
#ifndef TESTBUILD
    printf("%s\n", result);
#endif
    }
    return;
}


#ifndef TESTBUILD
int main(){
    int userInput = 0;
    int valid = 0;

    while (valid == 0){
        printf ("Please enter a FizzBuzz number: ");
        scanf ("%d", &userInput);
        printf("w/ n = %d\n\n", userInput);
        if (userInput < 1 ){
            printf("Please enter an integer greater than or equal to 1\n");
        }
        else{
            valid = 1;
        }
    }
    processUserInput(userInput);
return 0;
}
#endif
