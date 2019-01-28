/* Author: Tim Parrish January 22, 2019 */

#include <stdio.h>

void processUserInput(int passedNum){
    for (int i=1; i <= passedNum; i++){
        if ((i%3 == 0) && (i%5 == 0)){
            printf("FizzBuzz\n");
        }
        else if (i%3 == 0){
            printf("Fizz\n");
        }
        else if (i%5 == 0){
            printf("Buzz\n");
        }
        else{
            printf("%d\n", i);
        }
    }
}

int main(){
    int buzzyNum = 0;
    int valid = 0;

    while (valid == 0){
        printf ("Please enter a FizzBuzz number: ");
        scanf ("%d", &buzzyNum);
        printf("w/ n = %d\n\n", buzzyNum);
        if (buzzyNum < 1 ){
            printf("Please enter an integer greater than or equal to 1\n");
        }
        else{
            valid = 1;
        }
  }

    processUserInput(buzzyNum);

return 0;
}
