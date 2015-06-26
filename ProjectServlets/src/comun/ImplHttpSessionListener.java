package comun;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ImplHttpSessionListener implements HttpSessionListener{
	private Logger log = LogManager.getRootLogger();
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		log.trace("id sesión " + arg0.getSession().getId());
		ServletContext sc = arg0.getSession().getServletContext();
		Map<String,HttpSession> m = (Map<String, HttpSession>) sc.getAttribute("sesiones");
		m.put(arg0.getSession().getId(), arg0.getSession());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		ServletContext sc = arg0.getSession().getServletContext();
		Map<String,HttpSession> m = (Map<String, HttpSession>) sc.getAttribute("sesiones");
		HttpSession hs = m.remove(arg0.getSession().getId());
		log.trace("se ha eliminado la session " + hs.getId());
	}

}
