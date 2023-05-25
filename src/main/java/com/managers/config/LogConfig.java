package com.managers.config;

import com.managers.pojo.LogUser;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogConfig implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //请求地址
        String uri = request.getRequestURI();
        if(uri.contains("/index")||uri.contains("/forget")||uri.contains("/login")){
            return true;
        }
        //获取session
        HttpSession session = request.getSession();
        LogUser user = (LogUser) session.getAttribute("LogSuccess");
        //判断session中是否有用户数据，如果有，则返回true，继续向下执行
        if (user != null) {
            return true;
        }
        //不符合条件的转发到登录页面
        request.getRequestDispatcher("/jsp/index.jsp").forward(request, response);
        return false;
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
