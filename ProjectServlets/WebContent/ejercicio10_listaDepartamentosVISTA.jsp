<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import='jdbc.DepartamentoDTO' %>
<%@ page import='java.util.List' %>
<%@ page import='java.util.Iterator' %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Departamentos</title>
</head>
<body>
<h2>Lista de Departamentos</h2>
<form method="get" action="ServletListarEmpleadosPorDepartamento">
<select name="departamento">
<%
List<DepartamentoDTO> listaDepartamentos = (List<DepartamentoDTO>)request.getAttribute("listaDepartamentos");
Iterator<DepartamentoDTO> it = listaDepartamentos.iterator();
while (it.hasNext())
{
	DepartamentoDTO dpto = it.next();
	%>
	<option value=<%=dpto.getDEPARTMENT_ID() %>><%=dpto.getDEPARTMENT_NAME() %></option>
	<%	
}
%>
</select>
<input type="submit" value="BUSCAR">
</form>
</body>
</html>