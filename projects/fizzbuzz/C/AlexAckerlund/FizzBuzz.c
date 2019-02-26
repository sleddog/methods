#include <stdio.h>
#include <string.h>

char output[12];

void FBB(int var)
{
	int found, num;
	char numAsString [2];//for those iterations that aren't divisible by 3, 5, or 7
	for(num = 1; num <= var; num++)
	{
		found = 0;
		memset(&output[0], 0, sizeof(output));
		if(num % 3 == 0)
			strcat(output, "Fizz");
		else
			found++;
		
		if(num % 5 == 0)
			strcat(output, "Buzz");
		else
			found++;

		if(num % 7 == 0)
			strcat(output, "Bazz");
		else
			found++;
		#ifndef UnitTest
		if(found == 3)
			printf("%d\n",num);
		else
			printf("%s\n", output);
		#endif
		if(found == 3)
		{
			sprintf(numAsString, "%d", num);
			strcat(output, numAsString);
		}
	}
}
#ifndef UnitTest
int main()
{

	int num = 0, input;
	while(num <= 0)
	{
		printf("enter a number greater than 0: ");
		scanf("%d", &input);
		if(input > 0)
			num = input;
	}
	FBB(num);
	return 0;
}
#endif
