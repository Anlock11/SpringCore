package com.example.bai5;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class DemoBeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method , Object[] args, Object target)throws Throwable{
        System.out.println("before method: " + method.getName());
    }
}
