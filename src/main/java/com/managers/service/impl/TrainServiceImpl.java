package com.managers.service.impl;

import com.managers.mapper.TrainMapper;
import com.managers.pojo.Trains;
import com.managers.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TrainServiceImpl implements TrainService {

    //连接mapper层
    @Autowired
    private TrainMapper trainMapper;

    //查询培训机构
    public ArrayList<Trains> trains() {
        return trainMapper.trains();
    }
}
