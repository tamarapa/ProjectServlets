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

import jdbc.EmpleadoDTO;
import jdbc.EmpleadoJDBCDAO;


/**
 * 
 * @author Tamara P.A.
 *
 */
public class ServletEjerBean extends HttpServlet{
	private final static Logger log = LogManager.getRootLogger();
	//doGet
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//CONTROLADOR
		
		//recibe la petición y pide a la capa de negocio la info del empleado,
		//esta devolverá un bean de tipo empleado
		String idEmpleado = req.getParameter("idEmpleado");
		EmpleadoDTO eDTO = null;
		EmpleadoJDBCDAO eDAO = new EmpleadoJDBCDAO();
		eDTO = eDAO.leerEmpleado(Integer.parseInt(idEmpleado)); 
		// controlar si eDAO contiene algo o es null
		if (eDTO!=null)
		{
			ServletContext sc = req.getServletContext();
			System.out.println("el id del empleado es " + idEmpleado);
			System.out.println("el nombre del empleado es " + eDTO.getFirst_name());
			sc.setAttribute("empleadoBEAN", eDTO);
			//aqui habría que utilizar el dispatcher y el forward, MODIFICARLO
			req.getRequestDispatcher("ejercicio9_empleadoBeanVISTA.jsp").forward(req, resp);
		}
		else
		{
			PrintWriter pw = resp.getWriter();
			pw.println("<p>");
			pw.println("El empleado no existe");
			pw.println("</p>");
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
