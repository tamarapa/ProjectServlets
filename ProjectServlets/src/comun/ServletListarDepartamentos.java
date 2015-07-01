package comun;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
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
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		
		pw.println("<p>");
		pw.println("<select>");
		//while
		Iterator<DepartamentoDTO> it = listaDepartamentos.iterator();
		while (it.hasNext()) {
			DepartamentoDTO dpto = (DepartamentoDTO) it.next();
			pw.println("<option value='" + dpto.getDEPARTMENT_ID() + "' >" + dpto.getDEPARTMENT_NAME() + "</option>");
		}
		pw.println("</select>");
		pw.println("</p>");
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
