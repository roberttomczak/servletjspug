<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

Imie: <%=request.getParameter("imie")%><br />
Nazwisko: <%=request.getParameter("nazwisko")%><br />
Wybral hobby: 
<ul>
<%

if (request.getParameterValues("hobby") != null){
	for(String hobby : request.getParameterValues("hobby")) {
  	out.println("<li>" + hobby + "</li>");
	}
}else{
		out.println("<h4> brak hobby</h4>");
}
%>
</ul>
Wybral jedzenie: 
<ul>
<%=request.getParameter("jedzenie")%>
</ul>

Wybral samochody: 
<ul>
<%

if (request.getParameterValues("cars") != null){
	for(String cars : request.getParameterValues("cars")) {
   	out.println("<li>" + cars + "</li>");
	}
}else{
	out.println("<h4> brak samochodów</h4>");
}
%>

</body>
</html>