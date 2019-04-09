<?php
   error_reporting(-1);
   ini_set('display_errors', True);
   //ensure all parameters are valid
   if (array_key_exists("latitude",$_GET) && array_key_exists("longitude",$_GET)){
      echo get_json($_GET["latitude"], $_GET["longitude"]);
   } else {
      echo "Cannot process request:  Latitude or longitude parameter missing\n";
   }

   function get_json($latitude, $longitude){
      //Set default values for non-required parameters
      $width = 600;
      $height = 400;
      $zoom = 13;
      //Use custom param values if present
      if (array_key_exists("width",$_GET)){$width = $_GET["width"];}
      if (array_key_exists("height",$_GET)){$height = $_GET["height"];}
      if (array_key_exists("zoom",$_GET)){$zoom = $_GET["zoom"];}

      //Ensure proper data types
      if (is_numeric($latitude) === false){echo "Error:  Latitude must be a number"; return "";}
      if (is_numeric($longitude) === false){echo "Error:  Longitude must be a number"; return "";}
      $latf = (float)$latitude;
      $lonf = (float)$longitude;
      if (filter_var($width, FILTER_VALIDATE_INT) === false){echo "Error:  Width must be an integer."; return "";}
      if (filter_var($height, FILTER_VALIDATE_INT) === false){echo "Error:  Height must be an integer."; return "";}
      if (filter_var($zoom, FILTER_VALIDATE_INT) === false){echo "Error:  Zoom must be an integer."; return "";}
      
      //create apropriate URL string for image
      $urlstring = "https://tyler-demo.herokuapp.com/?greyscale=False&lat=$latf&lon=$lonf&zoom=$zoom&width=$width&height=$height";
      //Return JSON containing URL
      $jsonarray = array("URL"=>$urlstring);
      return json_encode($jsonarray, JSON_UNESCAPED_SLASHES);
   }
   //convert our parameters to params of tyler demo
   //create appropriate URL string for image
   //Return JSON containing URL
