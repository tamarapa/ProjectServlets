package comun;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ImplServletRequestListener implements ServletRequestListener{
	private Logger log = LogManager.getRootLogger();

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		log.trace("petición destriuda");
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		log.trace("petición inicializada");
	}

}
