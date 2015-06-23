package comun;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class EmployeesService {
	IRecuperable eDAO = null;
	private final static Logger log = LogManager.getRootLogger();
	
	public EmployeesService ()
	{			
		log.trace("EmployeesService - employeesService()");
	}
	
	public void setRecuperable (IRecuperable tipo_oDAO)
	{
		this.eDAO = tipo_oDAO;
	}
	
	public Object obtenerEmpleado(int id)
	{
		Object e = null;
		e = this.eDAO.leerEmpleado(id);
		return e;
	}
}
