package com.managers.service.impl;

import com.managers.mapper.LogMapper;
import com.managers.pojo.LogUser;
import com.managers.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogMapper logMapper;

    //用户登录
    public LogUser logUser(LogUser logUser) {
        return logMapper.logUser(logUser);
    }

    //忘记密码
    public int forget(LogUser logUser) {
        return logMapper.forget(logUser);
    }
}
