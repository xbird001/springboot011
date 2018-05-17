package springboot010;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class LoginListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("2.5容器启动完成....");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}

}
