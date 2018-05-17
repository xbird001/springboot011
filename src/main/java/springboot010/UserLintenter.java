package springboot010;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class UserLintenter implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("容器启动完成....");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}

}
