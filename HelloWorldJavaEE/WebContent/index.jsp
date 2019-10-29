<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World Java EE</title>
</head>
<body>
	<h1>Hello JSP and Servlet!</h1>
	<p>Greetings.  Do you want to view the next page <a href="pageOne.jsp">pageOne</a>?</p>
	
	<p>As an alternate, you could go to page two  <a href="pagetwo.jsp">pagetwo</a>?</p>
	
	
	<form action="helloServlet" method="post">
	Enter your name: <input type="text" name="yourName" size="20">
	<input type="submit" value="Call Servlet"/>
	</form>
	
	
	
</body>
</html>