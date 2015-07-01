package comun;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ImplFilterHIBERNATE implements Filter {
	
	private Logger log = LogManager.getRootLogger();

	@Override
	public void destroy() {
		log.trace("se destruye el filtro");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) arg0;
		HttpServletResponse res = (HttpServletResponse) arg1;
		
		String ruta = req.getRequestURI();
		System.out.println("RUTA: " + ruta);
		
		ServletContext sc = null;
		sc = arg0.getServletContext();
		int c = (int) sc.getAttribute("contador");
		c++;
		sc.setAttribute("contador",c);
		long tiempo1 = System.currentTimeMillis();
		arg2.doFilter(arg0, arg1);
		long tiempo2 = System.currentTimeMillis();
		log.trace("tiempo:"+(tiempo2-tiempo1));
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		log.trace("se inicia el filtro");
	}

}
