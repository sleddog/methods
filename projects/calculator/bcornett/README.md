Project 5
Group Name: bcornett
Members: Brady R. Cornett

========================================
Example Request 1:

'GET /calculator/op=add&fn=4&ln=2'

Example Response:

{FirstVar":4, "LastVar":2, "Results":6}

========================================
Hosting: AWS Elastic Beanstalk

Language: Python, Flask

Testing: cURL

========================================

URL: http://calculatorbrady-env-1.m2bhvtue83.us-west-2.elasticbeanstalk.com

Calculator URL: http://calculatorbrady-env-1.m2bhvtue83.us-west-2.elasticbeanstalk.com/calculator/op=...&fn=.*&ln=.*

This Flask web service provides a very simple calculator via variables input through the URL. (See the example GET request above)
