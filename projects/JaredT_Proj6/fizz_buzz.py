from flask import Flask
from flask import jsonify


app = Flask(__name__)
UrlPath = '/'
@app.route("/")
@app.route(UrlPath)
def empty():
    return "Send a number in!"
@app.route(UrlPath + '<int:num>')
def fizz_buzz(num):
    string = ' '
    for i in range(1,num+1):
        if (i%3==0 and i%5==0 and i % 7==0):
            string += "fizzbuzzbazz"
            #print("fizzbuzzbazz")
        elif (i%3==0 and i%5==0):
            string += "fizzbuzz"
            #print("fizzbuzz")
        elif (i%3==0 and i%7==0):
            string += "fizzbazz"
            #print("fizzbazz")
        elif (i%5==0 and i%7==0):
            string += "buzzbazz"
            #print("buzzbazz")
        elif (i%7==0):
            string += "bazz"
            #print("bazz")
        elif i%3==0:
            string += "fizz"
            #print("fizz")
        elif i%5==0:
            string += "buzz"
            #print("buzz")
        else:
            string += str(i)
            #print(i)
        string += "\n"
    return jsonify({'response': string})
if __name__ == "__main__":
    app.run()
