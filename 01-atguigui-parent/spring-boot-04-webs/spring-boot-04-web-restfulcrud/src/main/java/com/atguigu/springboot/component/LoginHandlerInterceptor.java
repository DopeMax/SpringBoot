package com.atguigu.springboot.component;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Chen
 * @created 2018-11-07-20:32.
 * * 登陆检查，
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //目标方法执行之前
        Object user = httpServletRequest.getSession().getAttribute("loginUser");
        if (user == null) {
            //未登陆，返回登陆页面
            httpServletRequest.setAttribute("msg", "没有权限，请先登陆！");
            httpServletRequest.getRequestDispatcher("/index.html").forward(httpServletRequest, httpServletResponse);
        } else {
            //已登陆，放行请求
            return true;
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
