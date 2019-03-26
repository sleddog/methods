from flask import Flask, jsonify, json, Response, request
from flask_cors import CORS
from util import hello_world

# A very basic API created using Flask that has two possible routes for requests.

app = Flask(__name__)
CORS(app)

# The service basepath has a short response just to ensure that healthchecks
# sent to the service root will receive a healthy response.
@app.route("/")
def healthCheckResponse():
    return jsonify({"message" : "Nothing here, used for health check. Try /helloworld instead."})

@app.route("/helloworld")
def getHelloWorld():

    #response = Response("helloworld")
    #response = Response(hello_world("yo yo"))
    name = request.args['name']
    data = hello_world(name)
    js = json.dumps(data)

    response = Response(js, status=200, mimetype='application/json')

    # set the Content-Type header so that the browser is aware that the response
    # is formatted as JSON and our frontend JavaScript code is able to
    # appropriately parse the response.
    response.headers["Content-Type"]= "application/json"

    return response

# Run the service on the local server it has been deployed to,
# listening on port 8080.
if __name__ == "__main__":
    app.run(host="0.0.0.0", port=8080)

