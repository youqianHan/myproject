package com.example.demo.utils;

import com.example.demo.config.IpWhiteList;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Arrays;

@Aspect
@Component
public class IpAspace {
    @Autowired
    IpWhiteList ipWhiteList;

    protected Logger log = LoggerFactory.getLogger(IpAspace.class);
    @Pointcut("@annotation(com.example.demo.annotation.LimitIp)")
    public void annotationPointcut() {
        log.info("cut");
    }
    @Before("annotationPointcut()")
    public void beforePointcut(JoinPoint joinPoint) {
        log.info("beforePointcut");
    }

    @After("annotationPointcut()")
    public void afterPointcut(JoinPoint joinPoint) {
        log.info("afterPointcut");
    }

    /**
     * 拦截器具体实现
     * @param pjp
     * @return JsonResult（被拦截方法的执行结果，或需要登录的错误提示。）
     */
    @Around("annotationPointcut()") //指定拦截器规则；也可以直接把“execution(* com.xjj.........)”写进这里
    public Object Interceptor(ProceedingJoinPoint pjp) throws Throwable {
        log.info("afterPointcut");
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod(); //获取被拦截的方法
        String methodName = method.getName(); //获取被拦截的方法名
        String [] value = ipWhiteList.getWhitelist().split(",");
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        String realIp = Iputil2.getRealIP(request);
        if(Arrays.stream(value).anyMatch(ip -> ip.equals(realIp))){
            return methodName+"方法被拦截"+"ipaddr:"+realIp;
        }
        return pjp.proceed();
    }

}
