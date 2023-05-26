package com.managers.service.impl;

import com.managers.mapper.PageMapper;
import com.managers.pojo.Page;
import com.managers.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PageServiceImpl implements PageService {
    //连接mapper层
    @Autowired
    private PageMapper pageMapper;

    //查询总记录数
    public int totals() {
        return pageMapper.totals();
    }

    //进行分页查询
    public ArrayList<Page> PageSelect(int offset, int limit) {
        return pageMapper.PageSelect(offset, limit);
    }

}
