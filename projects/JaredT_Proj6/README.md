Project 6 FizzBuzz Microservice.

Group: Jared Thompson

Introduction: This project is a simple FizzBuzz microservice hosted on Google Cloud. It takes a query number from the URL (see example requuest), and outputs the a json object in the form of a string response. 

Example Request: 
	'GET /fizz_buzz?n=10'
Example Response: 
	{1,2,"fizz",4,5,"fizz","buzz",8,"fizz",10}


Hosting: Google Cloud

Language: Python

Testing: Postman



How To:

The microservice does not work unless a virtual environment initialized and ran on google cloud. Below is a list of steps I did to create this microservice. The user will only be able to reproduce this if he/she takes the code and copies it into their own virtual machine on Google Cloud.


1. Create a google cloud account, go to the Virtual Machine tab and create a virtual machine.
    Once there, secure shell into it.
2. Download python-pip, python3-dev and nginx using command: sudo apt-get install ...
    --> The NGINX software package for reverse proxying, caching, web serving
    
3. Use pip to install a virtual environment and Flask: sudo pip3 install virtualenv (do the same command for flask)
4. Create reverse proxy by navigating to /etc/nginx/sites-enabled/default. Then update to code to look like the example below. Your two IP numbers should be different.

		server	{
     					listen 80;
				 	server_name 35.247.21.178; (name of VS where it will be looked up)
					location / {
        				 proxy_pass http://127.0.0.1:5000; (local environment proxy)
				{	
		}
        
7.   Add python app in folder
    1.  Make sure your python imports Flask and jsonify
    2.   Define URL path
    3. 	3. URL input <int:num> format. 
8. Source bin/activate to activate environment
9. Once the environment is activated the IP address, for this VM it is 35.247.21.178 should read with "Send a Number in!"
10. You can then test with Postman. 



