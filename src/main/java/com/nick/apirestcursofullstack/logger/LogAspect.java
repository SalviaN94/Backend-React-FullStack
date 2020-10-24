package com.nick.apirestcursofullstack.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Aspect
@Component
@Order(1)
public class LogAspect {

    @Autowired
    Writer writer;

    @After("loggingGetMethod()")
    public void logGetMethodInfo(final JoinPoint joinPoint) {
        Object parameters[] = joinPoint.getArgs();
        HttpServletRequest request = (HttpServletRequest) parameters[0];
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        writer.writeLog(dtf.format(now) + ": Realizada petición GET desde " + request.getRemoteAddr() + " hacia " +
                request.getRequestURL() + "\n");
    }

    @After("loggingPostMethod()")
    public void logPostMethodInfo(final JoinPoint joinPoint) {
        Object parameters[] = joinPoint.getArgs();
        HttpServletRequest request = (HttpServletRequest) parameters[0];
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        writer.writeLog(dtf.format(now) + ": Realizada petición POST desde " + request.getRemoteAddr() + " hacia " +
                request.getRequestURL() + "\n");
    }

    @Pointcut("@annotation(com.nick.apirestcursofullstack.logger.LogGetMethod)")
    private void loggingGetMethod() {
    }

    @Pointcut("@annotation(com.nick.apirestcursofullstack.logger.LogPostMethod)")
    private void loggingPostMethod() {

    }
}
