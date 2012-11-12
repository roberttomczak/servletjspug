package com.example.servletjspdemo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/form")
public class FormServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><h2>Latwy formularz</h2>" +
				"<form action='data'>" +
				"Imie: <input type='text' name='imie' /> <br />" +
				"Nazwisko: <input type='text' name='nazwisko' /> <br />" +
				"<input type='checkbox' name='hobby' value='bicycle'>I like riding a bicycle<br />" +
				"<input type='checkbox' name='hobby' value='tv'>I like watching TV<br />" +
				"<input type='checkbox' name='hobby' value='beer'>I like dringking beer<br />" +
				"<input type='checkbox' name='hobby' value='books'>I like reading books<br />" +
				"<div><br>"+
				"<input type='radio' name='jedzenie' value='Hamburger'> Hamburger<br> " +
				"<input type='radio' name='jedzenie' value='Pizza' checked> Pizza<br>" +
				"<input type='radio' name='jedzenie' value='Kebab'> Kebab"+
				"</div>" +
				"<select multiple='multiple' name='cars'>" +
				"<option value='volvo'>Volvo</option>"+
				"<option value='saab'>Saab</option>"+
				"<option value='opel'>Opel</option>"+
				"<option value='audi'>Audi</option>"+
				"</select>" +
				"<input type='submit' value=' OK ' />" +
				"</form>" +
				"</body></html>");
		out.close();
	}

}
