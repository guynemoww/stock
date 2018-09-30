package com.cdsj.design.web.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author teamsun_wangwei
 * @version V1.0.0
 * @Title:
 * @Package com.cdsj.mgr.aspect
 * @Description:
 * @date 2018/9/26 15:03
 */
@Component
@Aspect
public class ControllerAspect {
    private static final Logger logger = LoggerFactory.getLogger(ControllerAspect.class);

    @Pointcut("execution(public * com.cdsj.design.web.controller..*Controller.*(..))")
    public void controllerPointcut(){};

    @Before("controllerPointcut()")
    public void doBefore(JoinPoint joinPoint){
        logger.info("调用方法:{}.{}开始", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
        logger.info("请求入参:{}", Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(returning="result", pointcut="controllerPointcut()")
    public void doAfterReturning(Object result) throws Throwable{
        logger.info("返回结果:{}", result);
    }

}