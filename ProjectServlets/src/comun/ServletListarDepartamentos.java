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

/**
 * 
 * @author Tamara P.A.
 *
 */
public class ServletListarDepartamentos extends HttpServlet{
	private final static Logger log = LogManager.getRootLogger();
	
	//doGet
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		DepartmentService departmentService = new DepartmentService();					
		List<DepartamentoDTO> listaDepartamentos = departmentService.listarDepartamentos();
		req.setAttribute("listaDepartamentos", listaDepartamentos);
		//aqui habr�a que utilizar el dispatcher y el forward, MODIFICARLO
		req.getRequestDispatcher("ejercicio10_listaDepartamentosVISTA.jsp").forward(req, resp);		
	}
	//doPost
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	
	// m�todo que se va a ejecutar antes del doGet y doPost
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("entra en el service de SERVLET LISTAR DEPARTAMENTOS");
		super.service(arg0, arg1);
	}

}
