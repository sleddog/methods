from flask import Flask
from flask import jsonify
application = Flask(__name__)

# Home welcome for base URL
@application.route('/')
def welcome():
    return "Welcome to the calculator service created by Brady!"

# Application route for the actual calculator service
@application.route('/calculator/op=<op>&fn=<int:fn>&ln=<int:ln>')
def calculator(op, fn, ln):
    results = 0;
    if op == "add":
        results = fn + ln
    elif op == "sub":
        results = fn - ln
    elif op == "mul":
        results = fn * ln
    elif op == "div":
        results = fn / ln
    else:
        return "Invalid operator entered."
    return jsonify(FirstVar=fn, LastVar=ln, Results=results)

if __name__ == "__main__":
    application.run(host="0.0.0.0", port=8080)