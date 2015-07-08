<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import='jdbc.DepartamentoDTO, java.util.List, java.util.Iterator' %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Departamentos</title>
</head>
<body>
<h2>Lista de Departamentos</h2>
<form method="get" action="ServletListarEmpleadosPorDepartamentoElJstl">
<select name="departamento">

	<c:forEach items="${listaDepartamentos}" var="departamento" varStatus="i">
		<option value="<c:out value="${departamento.DEPARTMENT_ID}"></c:out>">	
		<c:out value="${departamento.DEPARTMENT_NAME}"></c:out>
		</option>
	</c:forEach>	
</select>
<input type="submit" value="BUSCAR">
</form>
</body>
</html>