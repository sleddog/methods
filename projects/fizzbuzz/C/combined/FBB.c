#include <string.h>
#include <stdio.h>

char result[13];
//new code area
struct KV{
	int key;
	char value[4];
};

struct KV keys[2];//increase this value when adding more key value pairs
//new code area end

void processUserInput(int passedNum){
	//initializes the elements of the struct array
	//follow this format when adding more key value pairs.
	keys[0].key = 3;
	strncpy(keys[0].value, "Fizz", 4);

	keys[1].key = 5;
	strncpy(keys[1].value, "Buzz", 4);

    char convertedInt[20];
    int i = 0;
    for (i=1; i <= passedNum; i++){
        memset(result,0,strlen(result));
        memset(convertedInt,0,strlen(convertedInt));
	//new Code area
	int j, found=0;
	for(j=0; j<2/*length of the struct array*/;j++){
		if(i%keys[j].key == 0){
			strncat(result, keys[j].value, 4);
			found++;
		}
	}
	if(found == 0){//nothing is in the string
		sprintf(convertedInt, "%d", i);
		strncat(result, convertedInt, 13);
	}
	found = 0;
	//new code area end
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
