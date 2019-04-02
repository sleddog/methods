Project Name: fizzbuzzwhatever
Description: This API allows the user to create their own fizz buzz bazz scheme. They can 
then query that scheme with its name and a number for input which will return a string 
that with the calculated fizz buzz output. The user can specify however many numbers with
corresponding phrase they want. They can also query existing schemes if they know the name
of the schemes. 

Examples:

POST /fizz/fizzbuzz,fizz%203,buzz%205

Server response => 200 added "info"

GET /fizz/fizzbuzz%2015

Server response => "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz"

Hosting: Probably AWS

Language: Java or maybe PHP

Testing: cURL requests




