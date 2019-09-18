package com.kodilla.patterns2.facade.dao;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class FacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeWatcher.class);


    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void basicLog(){
        LOGGER.info("Logging the event");
    }


    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(theOrder, userId) && target(object)")
    public void logEvent(OrderDto theOrder, Long userId, Object object){
        LOGGER.info("Class:" + object.getClass().getName() + ", Args:" + theOrder + ", " + userId);
    }

    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        Object result;
        try {
            long begin = System.currentTimeMillis();
            result= proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Time consumed:" + (end - begin) + " ms");
        } catch (Throwable throwable){
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }
}
