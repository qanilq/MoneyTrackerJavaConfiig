package com.hcl.anil.mt.webappconfig;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by M ANIL KUMAR on 01-05-2015.
 */
public class WebAppInitializer implements WebApplicationInitializer{
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext rootContext = getAnnotationWebContext();
        rootContext.register(ServiceConfig.class);
        servletContext.addListener(new ContextLoaderListener(rootContext));
        AnnotationConfigWebApplicationContext dispatcherContext = getAnnotationWebContext();
        dispatcherContext.register(MvcConfig.class);

        DispatcherServlet dispatcherServlet = new DispatcherServlet(dispatcherContext);
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher",dispatcherServlet);
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");


    }
    public AnnotationConfigWebApplicationContext getAnnotationWebContext(){
        return new AnnotationConfigWebApplicationContext();
    }
}
