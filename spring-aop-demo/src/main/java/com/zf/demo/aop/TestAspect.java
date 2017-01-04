package com.zf.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {

    @Pointcut("execution(public * com.zf.demo.service.impl.AbstractTestService+.*(..))")
    public void aspect() {

    }

    @Before("aspect()")
    public void before(JoinPoint joinPoint) {
        System.out.println("before");
    }

    @After("aspect()")
    public void after(JoinPoint joinPoint) {
        System.out.println("after");
    }
}
