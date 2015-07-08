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
public class ServletListarDepartamentosElJstl extends HttpServlet{
	private final static Logger log = LogManager.getRootLogger();
	
	//doGet
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		DepartmentService departmentService = new DepartmentService();					
		List<DepartamentoDTO> listaDepartamentos = departmentService.listarDepartamentos();
		req.setAttribute("listaDepartamentos", listaDepartamentos);
		//aqui habría que utilizar el dispatcher y el forward, MODIFICARLO
		req.getRequestDispatcher("ejercicio12_listaDepartamentosVISTA.jsp").forward(req, resp);		
	}
}
