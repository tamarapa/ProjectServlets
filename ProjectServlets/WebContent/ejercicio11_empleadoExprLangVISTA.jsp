<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Datos del empleado</h2>
<p>
<table style="width:50%">
  <tr>
    <td>Nombre</td>
    <td>
    	${empleadoExprLang.first_name}
   	</td> 
  </tr>
  <tr>
    <td>Apellidos</td>
    <td>${empleadoExprLang.last_name}</td>
  </tr>
</table>
</p>

</body>
</html>