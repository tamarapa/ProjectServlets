package comun;

import java.util.ArrayList;
import java.util.List;

import jdbc.DepartamentoDTO;
import jdbc.DepartamentoJDBCDAO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DepartmentService {
	
	DepartamentoJDBCDAO eDAO = null;
	private final static Logger log = LogManager.getRootLogger();
	
	public DepartmentService ()
	{			
		log.trace("se crea el objeto servicio de departamento");
		this.eDAO = new DepartamentoJDBCDAO();
	}	

	public ArrayList<DepartamentoDTO> listarDepartamentos() {
		// TODO Auto-generated method stub
		log.trace("entra en el método listarDepartamentos");
		ArrayList<DepartamentoDTO> listaDepartamento = new ArrayList<DepartamentoDTO>();
		listaDepartamento.addAll(this.eDAO.obtenerDepartamentos());
		return listaDepartamento;
	}

}
