package com.managers.service;

import com.managers.pojo.LogUser;

public interface LogService {
    //用户登录
    LogUser logUser(LogUser logUser);

    //忘记密码
    int forget(LogUser logUser);
}
