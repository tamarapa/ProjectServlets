package comun;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ImplServerContextListener implements ServletContextListener{
	private Logger log = LogManager.getRootLogger();

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		log.trace("ImplServerContextListener - contextDestroyed()");
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
		log.trace("ImplServerContextListener - contextInitialized()");
		//System.out.println("ImplServerContextListener - contextInitialized - Contexto inicializado - "+arg0.getServletContext().toString());
		/*
		SessionFactory sf = SessionManager.getSessionFactory();
		ServletContext servletContext = null;
		servletContext = arg0.getServletContext();
		servletContext.setAttribute("sf", sf);*/
	}

}
