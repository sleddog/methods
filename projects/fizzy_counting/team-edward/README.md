# **Team**: Team Edward

## **Partners**: Trent Baker, Marie Morin and Logan Shy

**Project**: FizzyCounting (your favorite toy function as a simple micro-service)

**Description**:
The user will be prompted for strings to associate with integers and a maximum value.

The program will iterate from 1 to the maximum value and include the associated string in the output for the current iteration if it is divisible by the associated number.

**Specifications**:

* Backend is a python function hosted using AWS Lambda
  * <https://gnis2begf9.execute-api.us-west-2.amazonaws.com/default/fizzy_counting>
  * Requests must include a parameter named `max`
  * Requests can include any number of rule parameters named as the integer divisors that have the value of the associated string (e.g. `?3=Fizz&7=Buzz`...)
  * the order of the parameters is unimportant
* Frontend is a simple node app hosted on Google Firebase
  * <http://team-edward.firebaseapp.com>
  * Currently, the frontend only supports adding strings associated with 1-9
* The latest version of the product can be found at <http://fizzycounting.tk>

## Development

### Frontend

The frontend was developed using npm. To participate in development, be sure you have npm installed and follow the following steps.

1. Install dependencies - with npm this is as simple as running `npm install` from the `frontend` directory that contains the `package.json` file.
2. Start development server - this is also quite easy with npm, from the same directory run `npm start`

Now you can make changes and view the effects in your browser. Once you have made changes that you want to deploy to firebase, run the `deploy` script in the same directory as `package.json`

### Backend

The backend was developed on AWS and the ability to submit sample requests is built into the Lambda online console. If you want to work locally, the logic of the code is located in the `lambda_function.py` file and could be tested by calling the `lambda_handler()` function.

Once you have made changes that you would like to publish to AWS Lambda, simply run the `deploy` script located in the same directory as `lambda_function.py` (NOTE: this script uses the `zip` command which is not available on Windows by default)