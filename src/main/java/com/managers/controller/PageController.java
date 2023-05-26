package com.managers.controller;

import com.managers.pojo.Page;
import com.managers.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/page")
public class PageController {

    //绑定service
    @Autowired
    private PageService pageService;

    //第一次进入
    @RequestMapping("/findPag")
    public String findPag(Model model) {
        Page page = new Page();
        //获取总记录数
        int totals = pageService.totals();
        page.setTotal(totals);

        //获取总页面数
        int totalPage = page.getTotalPage();
        page.setTotalPage(totalPage);

        //当前页面
        page.setPageNow(1);

        List<Page> pages = pageService.PageSelect(0, page.getCount());
        model.addAttribute("work", pages);
        model.addAttribute("pg", page);
        return "worker";
    }

    //从前端返回的数据
    @RequestMapping("/findPage")
    public String findPag(int nowPag, Model model) {
        Page page = new Page();
        //获取总记录数
        int totals = pageService.totals();
        page.setTotal(totals);

        //获取总页面数
        int totalPage = page.getTotalPage();
        page.setTotalPage(totalPage);

        //当前页面
        page.setPageNow(nowPag);
        int offset = (page.getPageNow() - 1) * (page.getCount());

        List<Page> pages = pageService.PageSelect(offset, page.getCount());
        model.addAttribute("work", pages);
        model.addAttribute("pg", page);
        return "worker";
    }
}
