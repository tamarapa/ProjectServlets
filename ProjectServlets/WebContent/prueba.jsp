<%@page import="com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array"%>
<%@ page language='java' contentType='text/html;charset=iso-8859-1'%> 
<%@ page import='java.util.Date' %>
<%@ page errorPage="error.jsp" %>
	
<html> 
	<head> 
		<title>Hola Mundo</title> 
	</head> 
	<body> 
		<p>Hola, esto es una página JSP.</p> 
		<p>La hora del servidor es <%= new Date() %></p>
		<%
		int[] anArray;
		anArray = new int[10];
		anArray[20] = 100;
		%> 
	</body> 
</html> 
