<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="mitag" uri="/WEB-INF/etiqueta.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>
ETIQUETA SIMPLE! <br>
<mitag:holaMundo nombre="Raul"/><br>
<mitag:nveces  num="3">cuerpo de la etiqueta</mitag:nveces><br>
<mitag:atrDinamico  num="5">${count}</mitag:atrDinamico><br>
</p>
<p>
<br>ETIQUETA CLASSIC! <br>
<mitag:classic  num="5" idcountry="${count}">${count}</mitag:classic>
</p>
</body>
</html>