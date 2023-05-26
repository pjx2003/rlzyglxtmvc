package com.managers.service;

import com.managers.pojo.Page;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface PageService {
    //查询总记录数
    int totals();

    //进行分页查询
    ArrayList<Page> PageSelect(@Param("offset") int offset, @Param("limit") int limit);
}
