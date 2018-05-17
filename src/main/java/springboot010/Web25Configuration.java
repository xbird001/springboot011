package springboot010;

import java.util.Arrays;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * 将Servelt、Filter、Listener注册到Spring的容器中去
 * @author Administrator
 *
 */
@SpringBootConfiguration
public class Web25Configuration {
	
	@Bean
	public ServletRegistrationBean createLoginServlet() {
		return new ServletRegistrationBean(new LoginServelt(), "/loginServelt.do");
	}
	
	@Bean
	public FilterRegistrationBean createLoginFilter() {
		FilterRegistrationBean frb = new FilterRegistrationBean();
		frb.setUrlPatterns(Arrays.asList("*.do"));
		frb.setFilter(new LoginFilter());
		return frb;
	}
	
	@Bean
	public ServletListenerRegistrationBean<LoginListener> createListener() {
		return new ServletListenerRegistrationBean<LoginListener>(new LoginListener());
	}
}
