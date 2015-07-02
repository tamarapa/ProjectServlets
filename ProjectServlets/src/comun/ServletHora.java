package comun;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
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
public class ServletHora extends HttpServlet{
	private final static Logger log = LogManager.getRootLogger();
	
	
	//doGet
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Date hora = new Date();
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("<p>");
		pw.println("HORA: " + hora);
		pw.println("</p>");
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
