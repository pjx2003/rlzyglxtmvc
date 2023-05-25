package com.managers.mapper;

import com.managers.pojo.Worker;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface WorkerMapper {
    //员工查询
    ArrayList<Worker> works();

    //员工注册
    int register(Worker worker);

    //通过姓名查询
    ArrayList<Worker> selWorker(@Param("username") String username);

    //通过id查询员工
    Worker workerId(@Param("id") int id);

    //修改员工信息
    int modifyWorker(Worker worker);
}
