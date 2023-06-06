package com.managers.controller;

import com.managers.pojo.LogUser;
import com.managers.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

@Controller
public class LogController {

    /*绑定service*/
    @Autowired
    private LogService logService;

    //用户登录
    @RequestMapping(value = "/login")
    public String logUser(String username, String password, HttpSession session, Model model) {
        LogUser logUser = logService.logUser(new LogUser(username, password));
        if (logUser != null) {
            session.setAttribute("LogSuccess", logUser);
            session.setAttribute("user", username);
            return "home";
        }
        model.addAttribute("msg", "登录失败");
        return "index";
    }

    //跳转忘记密码
    @RequestMapping("/forget")
    public String forget() {
        return "forget";
    }

    //忘记密码
    @RequestMapping(value = "/forgets", params = {"username", "password"}, method = RequestMethod.POST)
    public String forgets(String username, String password, Model model) {
        int forget = logService.forget(new LogUser(username, password));
        if (forget > 0) {
            model.addAttribute("msg", "修改成功,请重新登录");
            return "index";
        }
        model.addAttribute("msg", "修改失败,请检查用户名");
        model.addAttribute("username", username);
        return "forget";
    }

    //返回登录界面
    @RequestMapping("/index")
    //删除共享域中的值
    public String index(HttpSession session) {
        session.removeAttribute("LogSuccess");
        return "index";
    }

    //返回主页面
    @RequestMapping("/home")
    public String home() {
        return "home";
    }
}
