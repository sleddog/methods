from flask import Flask
from flask import jsonify
from flask import request

# A very basic API created using Flask that has two possible routes for requests.

application = Flask(__name__)

# The service basepath has a short response just to ensure that healthchecks
# sent to the service root will receive a healthy response.
@application.route("/")
def entry():
    return '''<h1>Project 6 by Joshua Stephenson-Losey</h1>
    <h3>You can ask the parrot to speak by typing /parrot?say={what you want to hear} into the url</h3>
    <p>for example: project6a.us-east-2.elasticbeanstalk.com/parrot?say=I%20Can%20Talk!</p>
    <a href="/parrot?say=I%20Can%20Talk!">Ask the parrot to say I Can Talk!</a>'''

@application.route("/parrot")
def parrot():
    repeat = request.args.get('say')

    return jsonify(Request=repeat, Responce=repeat)
    
    # return '''<h1>You told me to say: {}</h1>
            #   <p>Hope you enjoyed hearing it from me</p>'''.format(repeat)

# Run the service on the local server it has been deployed to,
# listening on port 8080.
if __name__ == "__main__":
    application.run(host="0.0.0.0", port=8080)