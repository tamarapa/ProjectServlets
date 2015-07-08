package customTags;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import jdbc.EmpleadoDTO;

import comun.DepartmentService;

public class EtiquetaSimpleEmpleadosPorDepartamento extends SimpleTagSupport{
	
	private int id;
	
	
	@Override
	public void doTag() throws JspException, IOException {
		//sSystem.out.println(getJspBody().toString());
		//recupero la lista de empleados en base al atributo id
		DepartmentService departmentService = new DepartmentService();
		List<EmpleadoDTO> listaEmpleados = departmentService.listarEmpleados(String.valueOf(id));
		Iterator<EmpleadoDTO> it = listaEmpleados.iterator();
		while (it.hasNext())
		{
			EmpleadoDTO e = it.next();
			getJspContext().getOut().print("NOMBRE: " + e.getFirst_name() + " SALARIO: " + e.getSalary() + "<br>");
		}
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	

}
