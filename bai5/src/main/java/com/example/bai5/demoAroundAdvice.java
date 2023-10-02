package com.example.bai5;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
public class demoAroundAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation  invocation) throws Throwable{
        // giong voi demo methodbeforAdvice
        System.out.println("around - before method: " + invocation.getMethod().getName());
        try {
            // proceed to original method call
            Object result = invocation.proceed();
            // giong voi afterReturningAdvice
            System.out.println("around - before method: " + invocation.getMethod().getName());
            return result;
        }catch (IllegalAccessException e){
            System.out.println("around - throw advice method " + invocation.getMethod().getName());
            throw  e;
        }
    }

}
