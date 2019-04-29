package com.exemple;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "FBBAppEngine",
    urlPatterns = {"/fbb"}
)
public class FBBAppEngine extends HttpServlet {
	public static String Fbb(int y) {
		String[] StringArray = new String[y+1];
		for (int i= 0; i < y+1; i++) {
			if(i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
				StringArray[i] = Integer.toString(i);
			}
			else{
				StringBuilder sb = new StringBuilder();

				if(i % 3 == 0){
					sb.append("Fizz");
				}
				if(i % 5 == 0) {
					sb.append("Buzz");
				}
				if(i % 7 == 0) {
					sb.append("Bazz");
				}
				StringArray[i] = sb.toString();
			}
		}
		return Arrays.toString(StringArray);
		
	}
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
	  
	  response.setContentType("text/html");
	  String param1 = request.getParameter("num");
	  String Result = Fbb(Integer.parseInt(param1));
	  response.getWriter().print(Result);

  }
}