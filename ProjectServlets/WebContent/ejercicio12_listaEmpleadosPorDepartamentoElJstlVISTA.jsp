<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import='jdbc.DepartamentoDTO, jdbc.EmpleadoDTO, java.util.List' %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Empleados</title>
</head>
<body>
<h2>Lista de Empleados</h2>
<form action="#">
<select name="empleado">
<c:forEach items="${listaEmpleados}" var="empleado" varStatus="i">
	<option value="<c:out value="${empleado.id}"></c:out>">
	<c:out value="${empleado.first_name}"></c:out>
</c:forEach>
</select>
</form>
</body>
</html>