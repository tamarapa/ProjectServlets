<%@page import="java.util.Random"%>
<%@ page language='java' contentType='text/html;charset=iso-8859-1'%> 
<%@ page import='java.util.Date' %> 
	
<html> 
	<head> 
		<title>Adivina el núumero</title> 
	</head> 
	
	<%!
	int min = 0;
	int max = 100;
	int numAdivina = -1;
	boolean adivina = false;
	
	private int generarNumero(int min, int max)
	{		
		int numAdivina;
		numAdivina = ((max+min)/2);
		return numAdivina;
	}
	
	public static int randInt(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	
	%> 
	<body>
	<%
	
	if (adivina==true)
	{
		adivina=false;
		min=0;
		max=100;
		numAdivina=-1;
		%>
		<p>oleeeee</p>
		<%
	
	}
	else
	{
		if (numAdivina == -1)
		{
			numAdivina = randInt(min, max);
			%>
			<p>A ver a ver ¿Es este?</p>
			<form action="adivinaNumero.jsp">
			<p>Número <input type="text" name="numero" value="<%=numAdivina%>"></p>
			<p>
				<select name="rdo">
					<option value="IGUAL">SIIII</option>
					<option value="MAYOR">es mayor</option>
					<option value="MENOR">es menor</option>
				</select>
			</p>  
			<input type="submit" value="ADIVINA">
			</form>	
			<%
		}
		else
		{
			if (request.getParameter("rdo").equals("IGUAL"))
			{
				adivina = true;
				response.sendRedirect("adivinaNumero.jsp");
			}
			else
			{
				if (request.getParameter("rdo").equals("MENOR"))
				{
					adivina = false;
					max = numAdivina;
					%>
					<p>limite minimo <%=min %></p>
					<p>limite máximo <%=numAdivina %></p>
					<% 					
					numAdivina = generarNumero(min, numAdivina);
					%>
					<p>Tu número es menor... mmmm ¿Es este?</p>
					<form action="adivinaNumero.jsp">
					<p>Número <input type="text" name="numero" value="<%=numAdivina%>"></p>
					<p>
						<select name="rdo">
							<option value="IGUAL">SIIII</option>
							<option value="MAYOR">es mayor</option>
							<option value="MENOR">es menor</option>
						</select>
					</p>  
					<input type="submit" value="ADIVINA">
					</form>	
					<%
				}
				else
				{
					adivina = false;
					min = numAdivina;
					%>
					<p>limite minimo <%=numAdivina %></p>
					<p>limite máximo <%=max %></p>
					<% 
					
					numAdivina = generarNumero(numAdivina, max);
					%>
					<p>Tu número es mayor... mmmm ¿Es este?</p>
					<form action="adivinaNumero.jsp">
					<p>Número <input type="text" name="numero" value="<%=numAdivina%>"></p>
					<p>
						<select name="rdo">
							<option value="IGUAL">SIIII</option>
							<option value="MAYOR">es mayor</option>
							<option value="MENOR">es menor</option>
						</select>
					</p>
					<input type="submit" value="ADIVINA">  
					</form>	
					<%
				}
			}		
		}
	}
	%>
	</body> 
</html> 