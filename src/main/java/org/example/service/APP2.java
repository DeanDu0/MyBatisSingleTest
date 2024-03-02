package org.example.service;

import org.example.config.SpringConfig;
import org.example.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class APP2 {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountDaoImp adi=ctx.getBean(AccountDaoImp.class);
        Account ac=adi.getById(1);
        System.out.println(ac);
//        System.out.println(adi);
//        System.out.println(adi.getClass());

    }
}
