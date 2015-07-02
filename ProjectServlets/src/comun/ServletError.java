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
public class ServletError extends HttpServlet{
	private final static Logger log = LogManager.getRootLogger();
	
	
	//doGet
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.sendRedirect("pagina_error.html");
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
		//log.trace("ERROR");
		/*
		Throwable excep = (Throwable) arg0.getAttribute("javax.servlet.error.exception"); 
		Integer codigoHTTP = (Integer) arg0.getAttribute("javax.servlet.error.status_code"); 
		String nombreServlet = (String) arg0.getAttribute("javax.servlet.error.servlet_name"); 
		
		if (null == nombreServlet )
	    {
			nombreServlet = "Desconocido"; 
	    } 
		
	    String uriPedida = (String) arg0.getAttribute("javax.servlet.error.request_uri"); 
	    
	    if (null== uriPedida )
	    {
	    	uriPedida = "Desconocida"; 
	    } 
	    log.trace("ERROR: " + excep + "(" + uriPedida + ")");
	    */
	    
		super.service(arg0, arg1);
	}

}
