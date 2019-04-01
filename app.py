from flask import Flask, render_template
import random

app = Flask(__name__)
urlPath = '/'
toGuess = random.randint(0,100)
print("The number to guess is: " + str(toGuess))

@app.route(urlPath + '?<int:myVar>')
def guesser(myVar):
	hot_cold = "Way out of the ballpark."
	if myVar == toGuess:
		close = "right on! Great Guessing!"
	elif myVar > toGuess:
		close = "You were a bit too high"
	else:
		close = "You were a bit too low"
	return render_template(urlPath, hot_cold = close)

@app.route(urlPath + '?<float:myVar>')#error handling for float input
def errorFloat(myVar):
	return render_template(urlPath, hot_cold = "Please enter and integer value")

@app.route(urlPath + '?<string:myVar>')#error handling for string input
def errorString(myVar):
	return render_template(urlPath, hot_cold = "Please enter and integer value")

@app.route(urlPath)#if no input is given
def empty():
	return render_template(urlPath, hot_cold = "Enjoy Guessing!")

if __name__ == '__main__':
	app.run(debug=True)
#debug=True means you don't have to restart the sever
#everytime you make a change. Remove this argument before
#submitting