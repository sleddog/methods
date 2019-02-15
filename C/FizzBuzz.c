#include <stdio.h>

int main()
{
	printf("enter a number greater than 0: ");
	int num = 0, input, found = 0;
	scanf("%d", &input);
	for(num = 1; num <= input; num++)
	{
		found = 0;
		if(num % 3 == 0)
			printf("Fizz");
		else
			found++;
		
		if(num % 5 == 0)
			printf("Buzz");
		else
			found++;

		if(num % 7 == 0)
			printf("Bazz");
		else
			found++;

		if(found == 3)
			printf("%d\n",num);
		else
			printf("\n");

		found = 0;
	}
	return 0;
}
