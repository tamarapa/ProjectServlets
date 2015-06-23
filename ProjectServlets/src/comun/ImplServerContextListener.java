package comun;

import hibernate.service.SessionManager;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.hibernate.SessionFactory;

public class ImplServerContextListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("ImplServerContextListener - contextDestroyed - Contexto destruido - "+arg0.getServletContext().toString());
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
		System.out.println("ImplServerContextListener - contextInitialized - Contexto inicializado - "+arg0.getServletContext().toString());
		/*
		SessionFactory sf = SessionManager.getSessionFactory();
		ServletContext servletContext = null;
		servletContext = arg0.getServletContext();
		servletContext.setAttribute("sf", sf);*/
	}

}
