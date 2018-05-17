spring boot web 二
	1、spring boot 静态资源的访问
		1.1、默认放在/src/main/webapp下可以直接访问，包括.html、img、css...
		1.2、查看org.springframework.boot.autoconfigure.web.ResourceProperties类里面的CLASSPATH_RESOURCE_LOCATIONS属性
			"classpath:/META-INF/resources/", "classpath:/resources/","classpath:/static/", "classpath:/public/"在这
			些类路径下都可以直接访问，是直接访问，访问方式：http://ip:端口/静态资源
			
	2、在spring boot下使用servlet
		2.1、Servlet3.0以上的用法
			2.1.1、开启@ServletComponentScan注解
			2.1.2、编写对应的Servlet、Filter、Listener并在编写的类上加上对应的注解
					XxxServlet --> @WebServlet(value="/userServlet.do") 详情参见springboot010.UserServlet
					XxxFilter ---> @WebFilter(value="*.do") 详情参见springboot010.UserFilter
					XxxLintenter ---> @WebFilter 详情参见springboot010.UserListener
		2.2、Servelt2.5及以下的用法
			2.2.1、编写对应的Servlet、Filter、Listener不加注解，应为2.5及以下的不支持注解
			2.2.2、编写sprinboot配置类，具体参见springboot010.Web25Configuration.class，里面有对应的Servelt、Filter、Listener的如何注册

