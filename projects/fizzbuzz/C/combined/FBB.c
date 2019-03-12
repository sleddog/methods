#include <string.h>
#include <stdio.h>

char result[13];

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
            strncat(result, convertedInt, 13);
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

    while (userInput <= 0){
        printf ("Please enter a FizzBuzz number greater than zero: ");
        scanf ("%d", &userInput);
        printf("w/ n = %d\n\n", userInput);
    }
    processUserInput(userInput);
return 0;
}
#endif
