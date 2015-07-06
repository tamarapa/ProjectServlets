package comun;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import jdbc.DepartamentoDTO;
import jdbc.EmpleadoDTO;

/**
 * 
 * @author Tamara P.A.
 *
 */
public class ServletListarEmpleadosPorDepartamento extends HttpServlet{
	private final static Logger log = LogManager.getRootLogger();
	
	//doGet
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		log.trace("ENTRO A doGet del ServletListarEmpleadosPorDepartamento");
		DepartmentService departmentService = new DepartmentService();
		List<EmpleadoDTO> listaEmpleados = departmentService.listarEmpleados(req.getParameter("departamento"));
		req.setAttribute("listaEmpleados", listaEmpleados);
		//aqui habría que utilizar el dispatcher y el forward, MODIFICARLO
		req.getRequestDispatcher("ejercicio10_listaEmpleadosPorDepartamentoVISTA.jsp").forward(req, resp);		
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
		System.out.println("entra en el service de SERVLET LISTAR DEPARTAMENTOS");
		super.service(arg0, arg1);
	}

}
