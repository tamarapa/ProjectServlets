package comun;
import hibernate.DAO.EmployeesHibernateDAO;
import hibernate.DTO.Employees;

import java.io.IOException;
import java.io.PrintWriter;

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
public class ServletEmpleados extends HttpServlet{
	
	//doGet
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeesService employeesService = new EmployeesService();
		int idEmpleado = Integer.parseInt(req.getParameter("id_empleado"));
		
		switch (req.getParameter("tipo_conexion")) {
		case "JDBC":
			IRecuperable i_jdbc = new EmpleadoJDBCDAO();
			employeesService.setRecuperable(i_jdbc);
			EmpleadoDTO e = (EmpleadoDTO) employeesService.obtenerEmpleado(idEmpleado);
			resp.setContentType("text/html");
			PrintWriter pw = resp.getWriter();
			if (e==null)
			{
				pw.println("El empleado no existe");
			}
			else
			{
				//System.out.println("NOMBRE: "+ e.getFirst_name());			
				//System.out.println("NOMBRE: "+ e.getFirstName());
				// aqui vamos a recibir el objeto de tipo empleado y mostraremos sus datos
				pw.println("<p>");
				pw.println("NOMBRE: " + e.getFirst_name() + "<br>");
				pw.println("APELLIDOS: " + e.getLast_name() + "<br>");
				pw.println("EMAIL: " + e.getEmail() + "<br>");
				pw.println("SALARIO: " + e.getSalary() + " &euro;<br>");
				pw.println("</p>");
			}
			break;
		case "HIBERNATE":
			IRecuperable i_hibernate = new EmployeesHibernateDAO();		
			employeesService.setRecuperable(i_hibernate);
			Employees e2 = (Employees) employeesService.obtenerEmpleado(idEmpleado);	
			resp.setContentType("text/html");
			PrintWriter pw2 = resp.getWriter();
			if (e2==null)
			{
				pw2.println("El empleado no existe");
			}
			else
			{
				// aqui vamos a recibir el objeto de tipo empleado y mostraremos sus datos
				pw2.println("<p>");
				pw2.println("NOMBRE: " + e2.getFirstName() + "<br>");
				pw2.println("APELLIDOS: " + e2.getLastName() + "<br>");
				pw2.println("EMAIL: " + e2.getEmail() + "<br>");
				pw2.println("SALARIO: " + e2.getSalary() + " &euro;<br>");
				pw2.println("</p>");
			}
			break;

		default:
			break;
		}
		//super.doGet(req, resp);
	}
	//doPost
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//super.doPost(req, resp);
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
