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
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ImplFilterMenu implements Filter {
	
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
		//con el (false) me devuelve un null si no tiene sesión, y si tiene, me la devuelve
		HttpSession hs = req.getSession(false);
		
		if (hs!=null)
		{
			//response redirect a la ruta
			arg2.doFilter(arg0, arg1);
		}
		else
		{
			if (ruta.equals("http://localhost:8090/ProjectServlets/"))
			{
				arg2.doFilter(arg0, arg1);
			}
			else
			{
				res.sendRedirect("http://localhost:8090/ProjectServlets/");
			}
		}
				
	}

	
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		log.trace("se inicia el filtro");
	}

}
