# MapGenerator

#Michael Seeley, Jonathan Sorem

MapGenerator is a PHP microservice which returns JSON containing a link to a generated OpenStreetsMap image, given coordinates, and optionally an image width and height in pixels and a zoom level.

Here is an example URL:
```http://uselessjunk.xyz/MapGenerator/service.php?latitude=45.677778&longitude=-111.047222&width=630&height=450&zoom=13```

This should produce the following JSON:
```{"URL":"https://tyler-demo.herokuapp.com/?greyscale=False&lat=45.677778&lon=-111.047222&zoom=13&width=630&height=450"}```

Following that URL should give a valid map, specifically (this one)[https://tyler-demo.herokuapp.com/?greyscale=False&lat=45.677778&lon=-111.047222&zoom=13&width=630&height=450]

##Running locally
Make sure PHP is installed. Place service.php in your server's folder.  On Linux Apache this is typically ```/var/www/html```.  Ensure that your web server is running.
To test using ```curl```, use the command ```curl localhost/service.php?latitude=45.6&longitude=-111.0``` or similar.  Only the Latitude and Longitude are required.  The script will give an error if improper parameter types are used.
