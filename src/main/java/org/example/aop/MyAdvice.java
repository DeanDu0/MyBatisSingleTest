package org.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

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
//    @AfterThrowing("pt()")
    public void method(JoinPoint jp){
        Object[] args=jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println(System.currentTimeMillis());
    }
//    @Around("pt()")
    public Object around(ProceedingJoinPoint pj) throws Throwable{
        System.out.println("around before advice.....");
        Object ac=pj.proceed();
        System.out.println("around after advice......");
        return ac;
    }
    @Pointcut("execution(* org.example.service.ResourceServiceImpl.openURL(*,*))")
    private void servicePt(){}
    @Around("servicePt()")
    public Object trimMethod(ProceedingJoinPoint pj) throws Throwable{
        Object[] args=pj.getArgs();
        for(int i=0;i< args.length;i++){
            if(args[i].getClass().equals(String.class)){
                args[i]=args[i].toString().trim();
            }
        }
        Object ret=pj.proceed(args);
        return ret;


    }

}
