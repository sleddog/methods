# Project 6

## Talking parrot (microservice)

### Joshua Stephenson-Losey

#### Details amd How to run

URL: http://project6a.us-east-2.elasticbeanstalk.com/

The home page tells exactly what to do but to rehash:

- after the URL type `/parrrot?say=` and tell it what to say

Example: http://project6a.us-east-2.elasticbeanstalk.com/parrot?say=I%20Can%20Talk!

Returns: {"Request":"I Can Talk!","Responce":"I Can Talk!"}

#### File structure

All the below mentioned files should be updated with any changes made to the service for re-deployment

- application.py
  - super simple python that will return a json responce based on the url input
- requirements.txt
  - a file telling Elastic Beanstalk what is needed in the environment for the application to run
- api.yaml
  - a promise of what the application will return

#### How to deploy using Elastic Beanstalk on AWS

- Go to the Elastic Beanstalk [homepage](https://aws.amazon.com/elasticbeanstalk/)
- Create an application
- Create an environment with a python platform (start with the sample incase there is an error so you have a state you can roll back to)
- After initial creation upload a zip file containing at least application.py and requirements.txt (ensure these are top level in the zip file and not in a sub folder)