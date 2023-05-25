package com.managers.service;

import com.managers.pojo.Worker;

import java.util.ArrayList;

public interface WorkerService {
    //查询所有员工
    ArrayList<Worker> workers();

    //员工注册
    int register(Worker worker);

    //通过姓名查询员工
    ArrayList<Worker> worker(String username);

    //通过id查询员工
    Worker workerId(int id);

    //修改员工信息
    int modifyWorker(Worker worker);
}
