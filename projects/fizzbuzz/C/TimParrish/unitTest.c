#define TESTBUILD
#include <string.h>
#include <stdio.h>
#include <criterion/criterion.h>
#include <criterion/new/assert.h>
#include "FizzBuzzBazz.c"

Test(Fizz, test) {
    processUserInput(3);
    printf("Test for Fizz. RESULT: %s\n", result);
    cr_expect(strcmp(result, "Fizz") == 0, "Expected \"Fizz\" with a passed arguement of 3");
}

Test(Buzz, test) {
    processUserInput(5);
    printf("Test for Buzz. RESULT: %s\n", result);
    cr_expect(strcmp(result, "Buzz") == 0, "Expected \"Buzz\" with a passed arguement of 5");
}

Test(Bazz, test) {
    processUserInput(7);
    printf("Test for Bazz. RESULT: %s\n", result);
    cr_expect(strcmp(result, "Bazz") == 0, "Expected \"Bazz\" with a passed arguement of 7");
}

Test(FizzBuzz, test) {
    processUserInput(15);
    printf("Test for FizzBuzz. RESULT: %s\n", result);
    cr_expect(strcmp(result, "FizzBuzz") == 0, "Expected \"FizzBuzz\" with a passed arguement of 15");
}

Test(FizzBazz, test) {
    processUserInput(21);
    printf("Test for FizzBazz. RESULT: %s\n", result);
    cr_expect(strcmp(result, "FizzBazz") == 0, "Expected \"FizzBazz\" with a passed arguement of 21");
}

Test(intEight, test) {
    processUserInput(8);
    printf("Test for '8'. RESULT: %s\n", result);
    cr_expect(strcmp(result, "8") == 0, "Expected \"8\" with a passed arguement of 8");
}