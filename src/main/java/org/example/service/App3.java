package org.example.service;

import org.example.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3 {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourceService resourceService=ctx.getBean(ResourceService.class);
        boolean b=resourceService.openURL("","root ");
        System.out.println(b);
    }
}
