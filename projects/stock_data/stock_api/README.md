# Project 6
## Members: Sam Caekaert


# Black Scholes (BSM) Option Price

This microservice can be used to calculate the Black Scholes value of a european stock option. 

To access the BSM microservice, go to: http://caekfin-env.svx9iujwq3.us-west-2.elasticbeanstalk.com


An example BSM calculation can be seen by navigating to:
```    
`http://caekfin-env.svx9iujwq3.us-west-2.elasticbeanstalk.com/bsm/otype=c&S=100&K=100&tm=1&r=0.05&d=0&sig=0.2`
```

# How this was built:

The web service is hosted using AWS Beanstalk. I relied on the web interface and did not use the command line interface (CLI). I upload a zip file to a beanstalk environment. The zip file contains two files - application.py and requirements.txt. 

## requirements.txt

To create the requirements.txt I created a virtual environment by following the instructions from `https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/python-development-environment.html#python-common-setup-venv`


## Run locally

To test this script locally, I navigate to the appropriate directory and type the following from the command line:
    
```
$ python application.py
```

which gives me a link to `http://0.0.0.0:8080/`. This local link behaves the same as the AWS link.
