package comun;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sun.xml.internal.ws.api.policy.PolicyResolver.ServerContext;

import jdbc.UsuarioDTO;
import jdbc.UsuarioJDBCDAO;

/**
 * 
 * @author Tamara P.A.
 *
 */
public class ServletPeticiones extends HttpServlet{
	private final static Logger log = LogManager.getRootLogger();
	//doGet
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ServletContext sc = req.getServletContext();
		HashMap<String, HttpSession> m = (HashMap<String, HttpSession>) sc.getAttribute("sesiones");
		Iterator<Entry<String, HttpSession>> it = m.entrySet().iterator();
		Map.Entry<String, HttpSession> e = null;
		while (it.hasNext())
		{
			e = it.next();
			log.debug(e.getKey());
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
