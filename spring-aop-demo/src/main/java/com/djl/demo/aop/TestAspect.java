package com.djl.demo.aop;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TestAspect {
    final static Logger log = Logger.getLogger(TestAspect.class.getName());

    public void doAfter(JoinPoint jp) {
        log.info("log Ending method: " + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName());
        Object[] args = jp.getArgs();
        if (args != null) {
            System.out.println("参数:\t");
            for (Object obj : args) {
                System.out.print(obj + "\t");
            }
            System.out.println();
        }

    }

    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        long time = System.currentTimeMillis();
        Object retVal = pjp.proceed();
        time = System.currentTimeMillis() - time;
        log.info("process time: " + time + " ms");
        return retVal;
    }

    public void doBefore(JoinPoint jp) {
        log.info("log Begining method: " + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName());
    }

    public void doThrowing(JoinPoint jp, Throwable ex) {
        log.info("method " + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName()
                + " throw exception");
        log.info(ex.getMessage());
    }
}
