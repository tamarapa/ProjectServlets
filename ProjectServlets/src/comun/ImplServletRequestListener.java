package comun;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class ImplServletRequestListener implements ServletRequestListener{

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("ImplServletRequestListener - requestDestroyed - Petición destruida");
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("ImplServletRequestListener - requestInitialized - Petición inicializada");
	}

}
