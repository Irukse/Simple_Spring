package ru.irute.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }
    //<param-value>/WEB-INF/applicationContextMVC.xml</param-value>
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class};
    }
    //<url-pattern>/</url-pattern>
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}

//    <?xml version="1.0" encoding="UTF-8"?>
//<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//        xmlns="http://xmlns.jcp.org/xml/ns/javaee"
//        xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
//        id="WebApp_ID" version="3.1">
//
//<display-name>spring-mvc-app1</display-name>
//
//<absolute-ordering/>
//
//<servlet>
//<servlet-name>dispatcher</servlet-name>
//<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
//<init-param>
//<param-name>contextConfigLocation</param-name>
//<param-value>/WEB-INF/applicationContextMVC.xml</param-value>
//</init-param>
//<load-on-startup>1</load-on-startup>
//</servlet>
//
//<servlet-mapping>
//<servlet-name>dispatcher</servlet-name>
//<url-pattern>/</url-pattern>
//</servlet-mapping>
//
//</web-app>