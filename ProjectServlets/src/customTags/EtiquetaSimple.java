package customTags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class EtiquetaSimple extends SimpleTagSupport{
	
	private String nombre;
	
	
	@Override
	public void doTag() throws JspException, IOException {
		//sSystem.out.println(getJspBody().toString());
		getJspContext().getOut().println("EtiquetaSimple.jsp: doTag()");
		if (null!=nombre)
		{
			getJspContext().getOut().println("variable nombre : " + nombre);
		}
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
