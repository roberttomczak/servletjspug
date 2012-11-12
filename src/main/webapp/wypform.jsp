<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formularz JSP</title>
</head>
<body>

<h2>Formularz JSP</h2>
				<form action='formularz.jsp'>
				Imie: <input type='text' name='imie' /> <br />
				Nazwisko: <input type='text' name='nazwisko' /> <br />
				<input type='checkbox' name='hobby' value='bicycle'>I like riding a bicycle<br />
				<input type='checkbox' name='hobby' value='tv'>I like watching TV<br />
				<input type='checkbox' name='hobby' value='beer'>I like drinking beer<br />
				<input type='checkbox' name='hobby' value='books'>I like reading books<br />
				<div><br>
				<input type='radio' name='jedzenie' value='Hamburger'> Hamburger<br>
				<input type='radio' name='jedzenie' value='Pizza' checked> Pizza<br>
				<input type='radio' name='jedzenie' value='Kebab'> Kebab
				</div>
				<select multiple='multiple' name='cars'>
				<option value='volvo'>Volvo</option>
				<option value='saab'>Saab</option>
				<option value='opel'>Opel</option>
				<option value='audi'>Audi</option>
				</select>
				<input type='submit' value=' OK ' />
				</form>
				

</body>
</html>