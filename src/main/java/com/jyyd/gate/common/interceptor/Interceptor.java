package com.jyyd.gate.common.interceptor;

import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 拦截器实现类
 */
@Component
public class Interceptor implements HandlerInterceptor {

    private final Logger logger = Logger.getLogger(getClass());

    @Override
    public boolean preHandle(@NotNull HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        logger.info("【日志提醒】进入request请求前身份验证！");
        logger.info("【日志提醒】获取请求名！");
        //        获取请求头token
       /* String token = httpServletRequest.getHeader("Authorization");
        if(token.equals("login")){
            // 判断路径是否含有login
            // 含有则开放
            // 否则不开放
            String pathInfo = httpServletRequest.getRequestURI();
            int index = pathInfo.indexOf("/login/");
            return index != -1;
        }
        System.out.println(token);*/
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("方法执行了！");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("方法结束了！");
    }
}
