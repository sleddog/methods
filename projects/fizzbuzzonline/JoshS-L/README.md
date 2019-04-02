# Project 5

## Joshua Stephenson-Losey

## FizzBuzz++ (Simple)

Build a microservice that accepts requests for a given number (n) and returns the FizzBuzz result(s)

### Signature

#### ex1

    `GET /fizzbuzz?n=15`

    {"n":"15","value":"FizzBuzz"}

    `GET /fizzbuzz?n=15&list=true`

    {"1", "2", "Fizz", "4", ... "FizzBuzz"}

#### ex2

    GET /fizzbuzz?n=7

    => {"n":"15","value":"FizzBuzz"}

    GET /fizzbuzz?n=15&list=true

    => {"1", "2", "Fizz", "4", ... "Bazz"}

### Details

- Hosting: google or azure
- Language: java
- Testing: cURL