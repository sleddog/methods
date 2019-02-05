#include <stdio.h>

int main()
{
	printf("Enter a number greater than 0: ");
	int num = 0;
	scanf("%d", &input);
	for(num = 1; num <= input; num++)
	{
		if(num%3==0 && num%5==0)
			printf("FizzBuzz");
		else if(num % 3==0)
			printf("Fizz");
		else if(num % 5==0)
			printf("Buzz");
		else
			printf("%d", num);
		printf("\n");
	}
	return 0;
}
