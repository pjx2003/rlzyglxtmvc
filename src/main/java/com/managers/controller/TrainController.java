package com.managers.controller;

import com.managers.pojo.Trains;
import com.managers.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/trains")
public class TrainController {
    //绑定service
    @Autowired
    private TrainService trainService;

    //查询培训机构
    @RequestMapping("/train")
    public String trains(Model model) {
        List<Trains> trains = trainService.trains();
        model.addAttribute("train", trains);
        return "training";
    }
}
