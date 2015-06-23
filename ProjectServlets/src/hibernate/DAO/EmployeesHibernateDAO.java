package hibernate.DAO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import comun.IRecuperable;

import hibernate.DTO.Employees;
import hibernate.service.SessionManager;


public class EmployeesHibernateDAO extends SuperClassDAO implements IRecuperable {
	
	private final static Logger log = LogManager.getRootLogger();

	public EmployeesHibernateDAO()
	{
		
	}

	@Override
	public Object leerEmpleado(int id) {
		// TODO Auto-generated method stub
		Employees e1 = null;

		Transaction transaction = null;
		Session s = SessionManager.obtenerSesionNueva();
		try 
    	{			
    		transaction = s.beginTransaction();
    		e1 = (Employees) s.get(Employees.class,id);
    	}
    	catch (Exception e)
    	{
    		e.printStackTrace();
    		transaction.rollback();//si algo ha ido mal, deshago la transacción
    		log.error("obtenerEmpleado");
    	}
    	finally 
    	{
    		SessionManager.cerrarSession(s);
    		log.trace("EmployeesService - obtenerEmpleado() - INICIO");
    	}
		return e1;
	}
}
