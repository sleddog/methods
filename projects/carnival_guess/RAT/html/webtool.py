from flask import Flask, render_template
import random

app = Flask(__name__)
htmlUrlPath = 'home.html'
pageUrlPath = '/'
toGuess = random.randint(0,100)#generates a random number
print("The number to guess is: " + str(toGuess))

#Handles empty input
@app.route(pageUrlPath)#if no input is given
def empty():
	return render_template(htmlUrlPath, hot_cold = "Enjoy Guessing!")

#Handles proper input
@app.route(pageUrlPath + '<int:myVar>')
def guesser(myVar):
	highSensitivity = 10#how far off you are
	lowSensitivity = 50

	if myVar == toGuess:#right on check
		close = "right on! Great Guessing!"

	elif myVar > (toGuess+highSensitivity):#kinda high check
		if myVar > (toGuess+lowSensitivity):#very high check
			close = "You were really high."
		else:
			close = "You were a bit too high."

	elif myVar < (toGuess-highSensitivity):#kinda low check
		if myVar < (toGuess-lowSensitivity):#kinda high check
			close = "You were really low."
		else:
			close = "You were a bit too low."

	else:#the guess is within 10 above or below the number to guess
		if myVar > toGuess:
			close = "You are barely too high."
		else:
			close = "You are barely too low."
	return render_template(htmlUrlPath, hot_cold = close)

#Handels bad number input
@app.route(pageUrlPath + '<float:myVar>')#error handling for float input
def errorFloat(myVar):
	return render_template(htmlUrlPath, hot_cold = "Please enter an integer value.")

#handles all other bad input
@app.route(pageUrlPath + '<string:myVar>')#error handling for string input
def errorString(myVar):
	return render_template(htmlUrlPath, hot_cold = "Please enter an integer value.")

#starts the program
if __name__ == '__main__':
	app.run()
