#define UnitTest

//criterion stuff
#include <criterion/criterion.h>
#include <criterion/new/assert.h>

//standard input/output
#include <stdio.h>

//more string capability and macros
#include <string.h>

//includes the FizzBuzz.c file right here (essentially copy and paste it at the #include)
#include "FizzBuzz.c"

Test(Fizz, test)//last value is Fizz
{
	FBB(3);
	printf("Testing for a final value of Fizz. Final value is: %s\n", output);
	cr_expect(strcmp(output, "Fizz") == 0, "'Fizz' is the expected output for an input of 3");
}

Test(Buzz, test)//last value is Buzz
{
	FBB(5);
	printf("Testing for a final value of Buzz. Final value is: %s\n", output);
	cr_expect(strcmp(output, "Buzz") == 0, "'Buzz' is the expected output for an input of 5");
}

Test(Bazz, test)//last value is Bazz
{
	FBB(7);
	printf("Testing for a final value of Bazz. Final value is: %s\n", output);
	cr_expect(strcmp(output, "Bazz") == 0, "'Bazz' is the expected output for an input of 7");
}

Test(intVal, test)//last value is a number
{
	FBB(2);
	printf("Testing for a final value of 2. Final value is: %s\n", output);
	cr_expect(strcmp(output, "2") == 0, "'2' is the expected output for an input of 2");
}
