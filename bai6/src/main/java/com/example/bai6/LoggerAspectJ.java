package com.example.bai6;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerAspectJ {
    @Before("execution(*stackjava.com.springaspectj.Hello.*(..))")
    public void logbBefore(JoinPoint joinPoint){
        System.out.println("Before method: " + joinPoint.getSignature().getName());
    }
}
