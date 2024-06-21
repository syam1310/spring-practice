package org.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
@Aspect
@Order(2)
public class LoggerAspects {

    private Logger logger = Logger.getLogger(LoggerAspects.class.getName());

    @Around("execution(* org.example.service.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.getSignature().toString() + " Method Execution Started with Execution way");
        logger.info(joinPoint.getSignature().toString() + " Method Execution Started");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method " + timeElapsed);
        logger.info(joinPoint.getSignature().toString() + " Method Execution End");
    }

    @Around("@annotation(org.example.interfaces.LogAspect)")
    public void logWithAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.getSignature().toString() + " Method Execution Started with Annotation way");
        logger.info(joinPoint.getSignature().toString() + " Method Execution Started");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method " + timeElapsed);
        logger.info(joinPoint.getSignature().toString() + " Method Execution End");
    }

    @AfterThrowing(value = "execution(* org.example.service.*.*(..))", throwing = "ex")
    public void logException(JoinPoint joinPoint, Exception ex) {
        logger.log(Level.SEVERE, joinPoint.getSignature() + " An Exception thrown with the help of " +
                "@AfterThrowing which happen due to " + ex.getMessage());
    }

    @AfterReturning(value = "execution(* org.example.service.*.*(..))", returning = "retVal")
    public void logStatus(JoinPoint joinPoint, Object retVal) {
        logger.log(Level.INFO, joinPoint.getSignature() + " Method Successfully processed with the status " + retVal.toString());
    }
}
