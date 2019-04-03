from flask import Flask
import json
app = Flask(__name__)

@app.route('/fizzbuzz/cap=<int:cap>&fizz=<fizz>&buzz=<buzz>&bazz=<bazz>')
def fizzbuzzbazz(cap, fizz, buzz, bazz):
    result = []
    for x in range(1, cap+1):
        entry = ""
        if x % 3 == 0:
            entry += fizz
        if x % 5 == 0:
            entry += buzz
        if x % 7 == 0:
            entry += bazz
        if entry == "":
            entry = str(x)
        result.append(entry)

    return json.dumps(result)
	
@app.route('/fizzbuzz')
def fizzbuzz():
    result = []
    for x in range(1, 21):
        entry = ""
        if x % 3 == 0:
            entry += "Fizz"
        if x % 5 == 0:
            entry += "Buzz"
        if entry == "":
            entry = x
        result.append(entry)

    return json.dumps(result)
if __name__ == "__main__":
    app.run(host="0.0.0.0", port=80)