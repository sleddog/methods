# Project 5
## Group name: The Fellowship of the Code
## Member: Jase Rost

# Fizzbuzz+

This microservice will have a user enter hat they want the program to count to, followed by what they want to use to replace the words "fizz", "buzz", and "bazz."

### Example 1

	Request: "GET /fizzbuzz/cap=16&fizz=slim&buzz=jim&bazz=snap"
	
	Returns: {1, 2, "slim", 4, "jim", "slim", "snap", 8, "slim", "jim", 11, "slim", 13, "snap", "slimjim", 16}
	
### Example 2

	Request: "GET /fizzbuzz/cap=7&fizz=i&buzz=want&bazz=candy"
	
	Returns: {1, 2, "i", 4, "want", "i", "candy"}
	
### Example 3
	Request: "GET /fizzbuzz"
	
	Returns: {1, 2, "fizz", 4, "buzz", "fizz", 7, 8, "fizz", "buzz", 11, "fizz", 13, 14, fizzbuzz, 16}
	
### Hosting
AWS Elastic Beanstalk
	
### Language
Python
	
### Testing
cURL