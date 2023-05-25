package com.managers.mapper;

import com.managers.pojo.LogUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogMapper {
    //用户登录
    LogUser logUser(LogUser logUser);

    //忘记密码
    int forget(LogUser logUser);
}
