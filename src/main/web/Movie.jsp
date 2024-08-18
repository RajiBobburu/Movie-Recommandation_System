<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="movie">
	<pre>
		Name     :    <input type="text" name="n">
		Language :    <select name="l">
						<option>---select--</option>
						<option value="English">ENGLISH</option>
						<option value="Telugu">TELUGU</option>
						<option value="Hindi">HINDI</option>
						<option value="Malayalam">MALAYALAM</option>
					</select>	
		Hero     :   <input type="text" name="h">
		Type     :     <input type="radio" name="t" value="a">   A
			       <input type="radio" name="t" value="b">   B
			       <input type="radio" name="t" value="c">   C
			    
			
				<input type="submit">
	</pre>
	</form>
</body>
</html>