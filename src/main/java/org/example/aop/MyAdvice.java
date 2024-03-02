package org.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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
//    @Before("pt()")
    //定义通知方法
//    @After("pt()")
//    @AfterReturning("pt()")
    @AfterThrowing("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
//    @Around("pt()")
    public Object around(ProceedingJoinPoint pj) throws Throwable{
        System.out.println("around before advice.....");
        Object ac=pj.proceed();
        System.out.println("around after advice......");
        return ac;
    }
}
