package comun;
import hibernate.DAO.EmployeesHibernateDAO;
import hibernate.DTO.Employees;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comun.IRecuperable;

import jdbc.EmpleadoDTO;
import jdbc.EmpleadoJDBCDAO;

/**
 * 
 * @author Tamara P.A.
 *
 */
public class ServletEmpleadosJDBC extends HttpServlet{
	
	//doGet
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeesService employeesService = new EmployeesService();
		int idEmpleado = Integer.parseInt(req.getParameter("id_empleado"));
		
		
			IRecuperable i_jdbc = new EmpleadoJDBCDAO();
			employeesService.setRecuperable(i_jdbc);
			System.out.println(getServletContext().getInitParameter("saludo"));
			
			ServletConfig conf = getServletConfig();
			System.out.println(conf.getInitParameter("incr"));

			
			EmpleadoDTO e = (EmpleadoDTO) employeesService.obtenerEmpleado(idEmpleado);
			resp.setContentType("text/html");
			PrintWriter pw = resp.getWriter();
			ServletContext sc = null;
			sc = req.getServletContext();
			int c = (int) sc.getAttribute("contador");
			if (e==null)
			{
				pw.println("El empleado no existe");
			}
			else
			{
				pw.println("<p>");
				pw.println("CONTADOR DE PETICIONES:"+c);
				pw.println("</p>");
				pw.println("<p>");
				pw.println("NOMBRE: " + e.getFirst_name() + "<br>");
				pw.println("APELLIDOS: " + e.getLast_name() + "<br>");
				pw.println("EMAIL: " + e.getEmail() + "<br>");
				pw.println("SALARIO: " + e.getSalary() + " &euro;<br>");
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
