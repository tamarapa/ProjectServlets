package comun;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jdbc.UsuarioDTO;
import jdbc.UsuarioJDBCDAO;

/**
 * 
 * @author Tamara P.A.
 *
 */
public class ServletSesion extends HttpServlet{
	private final static Logger log = LogManager.getRootLogger();
	//doGet
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession s = null;
		//obtengo la sesión con false
		s=req.getSession(false);
		if (null==s)
		{
			log.info("cliente sin sesión asociada");
			//creo la sesión
			s = req.getSession();			
		}
		else
		{
			log.info("cliente con sesión asociada ");
		}
	}
	//doPost
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	
	// método que se va a ejecutar antes del doGet y doPost
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service");
		super.service(arg0, arg1);
	}

}
