package com.managers.service.impl;

import com.managers.mapper.WorkerMapper;
import com.managers.pojo.Worker;
import com.managers.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class WorkerServiceImpl implements WorkerService {

    //连接mapper层
    @Autowired
    private WorkerMapper workerMapper;

    //查询员工
    public ArrayList<Worker> workers() {
        return workerMapper.works();
    }

    //员工注册
    public int register(Worker worker) {
        return workerMapper.register(worker);
    }

    //通过姓名查询员工
    public ArrayList<Worker> worker(String username) {
        return workerMapper.selWorker(username);
    }

    //通过id查询员工
    public Worker workerId(int id) {
        return workerMapper.workerId(id);
    }

    //修改员工信息
    public int modifyWorker(Worker worker) {
        return workerMapper.modifyWorker(worker);
    }
}
