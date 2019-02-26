# Project 5
## Group name: The Fellowship of the Code
## Member: Jase Rost

# Fizzbuzz++

This microservice will have a user enter combinations of numbers and what word they want to replace numbers divisable by that
number with, followed by what they want the program to count to.

### Example 1

	Request: "GET /fizzbuzz?n=16&fizz=slim&buzz=jim&bazz=snap"
	
	Returns: {1, 2, "slim", 4, "jim", "slim", "snap", 8, "slim", "jim", 11, "slim", 13, "snap", "slimjim", 16}
	
### Example 2

	Request: "GET /fizzbuzz?n=7&fizz=i&buzz=want&bazz=candy"
	
	Returns: {1, 2, "i", 4, "want", "i", "candy"}
	
###