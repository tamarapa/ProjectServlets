package comun;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ImplFilter implements Filter {
	
	private final static Logger log = LogManager.getRootLogger();

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		log.trace("ImplFilter - destroy()");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		log.trace("ImplFilter - doFilter()");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		log.trace("ImplFilter - init()");
	}

}
