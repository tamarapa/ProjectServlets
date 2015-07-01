package comun;
import hibernate.DAO.EmployeesHibernateDAO;
import hibernate.DTO.Employees;

import java.io.IOException;
import java.io.PrintWriter;

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
public class ServletEmpleadosHIBERNATE extends HttpServlet{
	
	//doGet
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeesService employeesService = new EmployeesService();
		int idEmpleado = Integer.parseInt(req.getParameter("id_empleado"));
			IRecuperable i_hibernate = new EmployeesHibernateDAO();		
			employeesService.setRecuperable(i_hibernate);
			Employees e2 = (Employees) employeesService.obtenerEmpleado(idEmpleado);	
			resp.setContentType("text/html");
			PrintWriter pw2 = resp.getWriter();
			ServletContext sc = null;
			sc = req.getServletContext();
			int c = (int) sc.getAttribute("contador");
			if (e2==null)
			{
				pw2.println("El empleado no existe");
			}
			else
			{
				pw2.println("<p>");
				pw2.println("CONTADOR DE PETICIONES:"+c);
				pw2.println("</p>");
				pw2.println("<p>");
				pw2.println("NOMBRE: " + e2.getFirstName() + "<br>");
				pw2.println("APELLIDOS: " + e2.getLastName() + "<br>");
				pw2.println("EMAIL: " + e2.getEmail() + "<br>");
				pw2.println("SALARIO: " + e2.getSalary() + " &euro;<br>");
				pw2.println("</p>");
				
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
