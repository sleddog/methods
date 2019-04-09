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
  * Currently, the frontend only supports adding strings associated with 3, 5, and 7
* The latest version of the product can be found at <http://fizzycounting.tk>