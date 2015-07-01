package comun;

import jdbc.UsuarioJDBCDAO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class UsuarioService {
	UsuarioJDBCDAO uDAO = null;
	private final static Logger log = LogManager.getRootLogger();
	
	public UsuarioService ()
	{			
		log.trace("UsuarioService - UsuarioService()");
	}
	
	public void setRecuperable (UsuarioJDBCDAO tipo_uDAO)
	{
		this.uDAO = tipo_uDAO;
	}
	
		
	public Object autenticarUsuario(String nombre, String password)
	{
		Object e = null;
		System.out.println("UsuarioService - autenticarUsuario - nombre: " + nombre + " - password: " + password);
		e = this.uDAO.leerUsuario(nombre,password);
		return e;
	}
}
