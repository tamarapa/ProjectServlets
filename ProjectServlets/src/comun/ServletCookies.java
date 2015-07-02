package comun;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import jdbc.DepartamentoDTO;

/**
 * 
 * @author Tamara P.A.
 *
 */
public class ServletCookies extends HttpServlet{
	private final static Logger log = LogManager.getRootLogger();
	
	/**
	 * Método que devuelve la cookie que se llama como la cadena que enviamos como parámetro.
	 * Si no existe, la creamos y la devolvemos.
	 * 
	 * @param nombre
	 * @return
	 */
	private Cookie obtenerCookie(String nombreCookie, HttpServletRequest req)
	{
		Cookie cookie = null;
		Cookie [] arrayCookie = null;
		boolean encontrada = false;
		Cookie cookieAux = null;
		int pos = 0;
		arrayCookie = req.getCookies();
		if (null==arrayCookie)
		{
			cookie = new Cookie(nombreCookie, "0");
		}
		else
		{
			while ((pos<arrayCookie.length)&&(!encontrada))
			{
				cookieAux = arrayCookie[pos];
				if (cookieAux.getName().equals(nombreCookie))
				{
					encontrada = true;
					cookie = cookieAux;
				}
				else
				{
					pos++;
				}
			}
			if (!encontrada)
			{
				cookie = new Cookie(nombreCookie, "0");
			}
		}
		return cookie;
	}
	
	//doGet
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		log.trace("entra en doGet");
		Cookie[] cookies = req.getCookies(); //LA RECUPERO
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		boolean existe = false;
		if (cookies != null) {
			//recorrer array de cookies
			for (int i = 0; i < cookies.length; i++) {
				if (cookies[i].getName().equals("numPeticiones")) 
				{
					existe = true;
					if (cookies[i].getValue().equals("2"))
					{
						pw.println("<p>");
						pw.println("NO PUEDES PASARRRRRR!!! (MAX PETICIONES ALCANZADAS)");
						pw.println("</p>");
					}
					else
					{
						int oldCookie = Integer.parseInt(cookies[i].getValue());
						pw.println("<br>oldCookie: " + oldCookie);
						int newCookie = oldCookie+1;
						pw.println("<br>newCookie: " + newCookie);
						cookies[i].setValue(""+newCookie);
						pw.println("<p>");
						pw.println("TODAVÍA PUEDES HACER PETICIONES ;)");											
						pw.println("</p>");
						resp.addCookie(cookies[i]);
					}
				}
			}
			if (!existe)
			{
				Cookie cookiePeticiones = new Cookie("numPeticiones","0"); 
				cookiePeticiones.setMaxAge(60*60*24); // segundos de un día
				resp.addCookie(cookiePeticiones);  //MANDO UNA COOKIE
			}
		}
		else
		{
			Cookie cookiePeticiones = new Cookie("numPeticiones","0"); 
			cookiePeticiones.setMaxAge(60*60*24); // segundos de un día
			resp.addCookie(cookiePeticiones);  //MANDO UNA COOKIE
		}		

		
	}
	//doPost
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}
	
	// método que se va a ejecutar antes del doGet y doPost
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		super.service(arg0, arg1);
	}

}
