package com.managers.controller;

import com.managers.pojo.Worker;
import com.managers.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/worker")
public class WorkerController {

    //连接service
    @Autowired
    private WorkerService workerService;

    //查询员工
    @RequestMapping("/work")
    public String Workers(Model model) {
        ArrayList<Worker> workers = workerService.workers();
        model.addAttribute("work", workers);
        return "worker";
    }

    //返回注册界面
    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    //员工注册
    @RequestMapping(value = "/registers", method = RequestMethod.POST)
    public String register(Worker worker, Model model) {
        int i = workerService.register(worker);
        if (i < 1) {
            model.addAttribute("err", "注册失败");
            return "register";
        }
        //重定向到work控制器
        return "redirect:/worker/work";
    }

    //指定员工查询
    @RequestMapping("/selWorker")
    public String selectWorker(String username, Model model) {
        List<Worker> worker = workerService.worker(username);
        //如果传入的数据为空
        if (username == null || username.equals("")) {
            //重定向work控制器
            return "redirect:/worker/work";
        }
        if (worker.size() == 0) {
            model.addAttribute("msg", "查询失败");
            return "worker";
        }
        model.addAttribute("work", worker);
        model.addAttribute("msg", "查询成功");
        return "worker";
    }

    //通过id查询
    @RequestMapping(value = "/workerId", method = RequestMethod.GET)
    public String workerId(int id, Model model) {
        Worker worker = workerService.workerId(id);
        System.out.println(worker);
        model.addAttribute("v", worker);
        return "modify";
    }

    //修改员工信息
    @RequestMapping("/modifyMorke")
    public String modifyWorker(Worker worker, Model model) {
        int i = workerService.modifyWorker(worker);
        if (i < 0) {
            model.addAttribute("err", "修改失败");
            return "modify";
        }
        return "redirect:/worker/work";
    }
}
