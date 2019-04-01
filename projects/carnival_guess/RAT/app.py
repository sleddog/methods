from flask import Flask, render_template
import random

app = Flask(__name__)

NumToGuess = random.randint(0,100)
print("The number to guess is: " + str(NumToGuess))
@app.route('/<int:guess>')
def foo(guess):
	hot_cold = "Way out of the ballpark."
	if guess == NumToGuess:
		close = "right on! Great Guessing!"
	elif guess > NumToGuess:
		close = "You were a bit too high"
	else:
		close = "You were a bit too low"
	return render_template('home.html', hot_cold = close)

@app.route('/')
def foo2():
	return render_template('home.html', hot_cold = "Enjoy Guessing!")

if __name__ == '__main__':
	app.run(debug=True)
#debug=True means you don't have to restart the sever
#everytime you make a change