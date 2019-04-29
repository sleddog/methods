### Carnival_Number_Guesser GET project

This project will take an argument via the command line in a web browser using a GET and check to see if the number passed is the correct one. The webpage will update with a hot/cold type response and you can guess again to get closer. The number will be hard-coded into the web application in order to allow the user to keep trying and have better than a one percent chance of guessing as the feedback helps them get closer.

* Group members (group name R.A.T.):
	* (R)yan Cummings
	* (A)lex Ackerland
	* (T)im Parrish
* Guess the magic number 20. (Will be different as number is randomized) Some sample inputs:
```
	1. http://206.189.64.4/IndustryMethods/10 response: You were a bit too low
	2. http://206.189.64.4/IndustryMethods/100 response: You were really high
	3. http://206.189.64.4/IndustryMethods/21 response: You are barely too high
	4. http://206.189.64.4/IndustryMethods/20 response: right on! Great Guessing!
```
* This will be hosted through [https://www.digitalocean.com/](https://www.digitalocean.com/)
* The languge framwork/tech stack is:
	* HTML
	* CSS
	* YAML
    * Python
    * Flask
    * Apache 2.2
        * mod_wsig

* The GET command will be tested through the [Swagger](https://swagger.io/tools/)


* Below are the instructions for running this webservice
To run the web service go to:
```
http://206.189.64.4/IndustryMethods
```

A random number between 0 and 100 inclusive is generated.
Your job is to try and guess this number.

To enter a guess, type an integer between 1 and 100 at the end of the url. The website will tell you whether your guess is high or low. You can adjust the number at the end of the url until you findthe correct answer.

