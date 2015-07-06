<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import='jdbc.DepartamentoDTO' %>
<%@ page import='jdbc.EmpleadoDTO' %>
<%@ page import='java.util.List' %>
<%@ page import='java.util.Iterator' %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Empleados</title>
</head>
<body>
<h2>Lista de Empleados</h2>
<form action="ServletListarEmpleadosPorDepartamento">
<select name="empleado">
<%
List<EmpleadoDTO> listaEmpleados = (List<EmpleadoDTO>)request.getAttribute("listaEmpleados");
Iterator<EmpleadoDTO> it = listaEmpleados.iterator();
while (it.hasNext())
{
	EmpleadoDTO e = it.next();
	%>
	<option value=<%=e.getId()%>><%=e.getFirst_name() %></option>
	<%	
}
%>
</select>
</form>
</body>
</html>