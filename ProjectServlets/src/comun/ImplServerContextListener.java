package comun;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ImplServerContextListener implements ServletContextListener{
	private Logger log = LogManager.getRootLogger();

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		log.trace("contexto destruido");
		//System.out.println("ImplServerContextListener - contextDestroyed - Contexto destruido - "+arg0.getServletContext().toString());
		/*
		ServletContext sC = null;		
		try {
			sC = arg0.getServletContext();
			SessionFactory sf = (SessionFactory) sC.getAttribute("sf");
			if (sf!=null){sf.close();}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		*/
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		log.trace("contexto inicializado");
		//System.out.println("ImplServerContextListener - contextInitialized - Contexto inicializado - "+arg0.getServletContext().toString());
		/*
		SessionFactory sf = SessionManager.getSessionFactory();
		ServletContext servletContext = null;
		servletContext = arg0.getServletContext();
		servletContext.setAttribute("sf", sf);*/
		/*
		Map<String,HttpSession> m = new HashMap<String, HttpSession>();		
		ServletContext sc = null;
		sc = arg0.getServletContext();
		int c = 0;
		sc.setAttribute("contador", c);
		sc.setAttribute("sesiones", m);
		*/
	}

}
