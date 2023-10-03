package com.guides.springboot.aspect;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoBeforeAdvice {
    @Before(value = "execution(* com.guides.springboot.service.UserService.getAllUsers())")
    public void logger(){
        System.out.println("--------");
        System.out.println("Bạn đã truy cập vào UserService vào createUsers ");
        System.out.println("----------");
    }
}
