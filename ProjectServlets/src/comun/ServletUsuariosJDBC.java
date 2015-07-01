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
public class ServletUsuariosJDBC extends HttpServlet{
	
	private final static Logger log = LogManager.getRootLogger();
	
	//doGet
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	//doPost
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		UsuarioService usuarioService = new UsuarioService();
		String nombreUsuario = req.getParameter("nombre_usuario");
		String passUsuario = req.getParameter("pass_usuario");
		
		System.out.println("doPost - nombre: " + nombreUsuario + " - pass: " + passUsuario);
		
		usuarioService.setRecuperable(new UsuarioJDBCDAO());
		
		UsuarioDTO u = (UsuarioDTO) usuarioService.autenticarUsuario(nombreUsuario, passUsuario);
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		if (u==null)
		{
			pw.println("El usuario no existe");
		}
		else
		{
			pw.println("<p>");
			pw.println("BIENVENIDO " + u.getUser_name());
			pw.println("</p>");
			
			HttpSession s = null;
			//obtengo la sesi�n con false		
			if (null==(s=req.getSession(false)))
			{
				log.info("cliente sin sesi�n asociada");
				//creo la sesi�n
				s = req.getSession();	
				s.setAttribute("nombreUsuario", nombreUsuario);
				log.info("cliente sin sesi�n asociada " + s.getAttribute("nombreUsuario"));
			}
			else
			{
				log.info("cliente con sesi�n asociada");
			}
		}			
	}
	
	// m�todo que se va a ejecutar antes del doGet y doPost
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service");
		super.service(arg0, arg1);
	}

}
