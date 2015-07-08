<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="jspTagLibEl.Persona, java.util.List, jspTagLibEl.Perro" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Persona> lista_personas_perros = new ArrayList<Persona>();
lista_personas_perros.add(new Persona(38, "Carmen",new Perro("Zarpas", "Mast�n")));
lista_personas_perros.add(new Persona(38, "Mar�a",new Perro("Rambo", "Caniche")));
lista_personas_perros.add(new Persona(25, "Juan",new Perro("Keku", "Cocker")));
lista_personas_perros.add(new Persona(31, "Tamarra",new Perro("Yako", "Golden")));
session.setAttribute("lista_personas_perros", lista_personas_perros);
%>

<br>PRIMER FORMA, con puntos, recorrido tipo Iterator<br>
<c:forEach items="${lista_personas_perros}" var="persona">
	<c:out value="${persona.nombre}"></c:out> de
	<c:out value="${persona.edad}"></c:out> a�os,  es due�o de
	<c:out value="${persona.perro.nombre}"></c:out> de raza
	<c:out value="${persona.perro.raza}"></c:out> <br>
	
</c:forEach>
<br>

</body>
</html>