### Carnival_Number_Guesser GET project

This project will take an argument via the command line in a web browser using a GET and check to see if the number passed is the correct one. The webpage will update with a hot/cold type response and you can guess again to get closer. The number will be hard-coded into the web application in order to allow the user to keep trying and have better than a one percent chance of guessing as the feedback helps them get closer.

* Group members (group name R.A.T.):
	* (R)yan Cummings
	* (A)lex Ackerland
	* (T)im Parrish
* Guess the magic number of 20. Some sample inputs:
```
	1. www.timothyparrish.com/?variable=27% response: close, no cigar
	2. www.timothyparrish.com/?variable=66% response: outta the ballpark
	3. www.timothyparrish.com/?variable=72% response: phone home
	4. www.timothyparrish.com/?variable=20% response: NAILED IT!
```
* This will be hosted through [timothyparrish.com](http://www.timothyparrish.com/)
* The languge framwork/tech stack is:
	* HTML
	* CSS
	* JavaScript
	* YAML
* The GET command will be tested through the [Swagger](https://swagger.io/tools/)


* Below are the instructions for running this webservice
To run the web service do:
```
$ python app.py
```

A random number between 0 and 100 inclusive is generated.
Your job is to try and guess this number.
To do this go to:
localhost:5000

To enter a guess go to
localhost:5000/<guess_number>
Note: <guess_number> is the integer value you wish to guess
