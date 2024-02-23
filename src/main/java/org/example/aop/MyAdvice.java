package org.example.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.example.domain.Account;
import org.springframework.stereotype.Component;

/**
 *定义通知类
 */
@Component
@Aspect
public class MyAdvice {
    //org.example.service.AccountDaoImp.getById(Integer)
    //* org.example.service.*.getById(Integer)
    @Pointcut("execution(* org.example.service.*.getById(..))")
    private void pt(){}
    @Before("pt()")
    //定义通知方法
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
