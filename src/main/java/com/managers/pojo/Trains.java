package com.managers.pojo;

public class Trains {
    //培训id
    private int id;
    //培训名称
    private String trainname;
    //培训负责人
    private String trainpeople;
    //培训时间
    private int traintime;

    public Trains(int id, String trainname, String trainpeople, int traintime) {
        this.id = id;
        this.trainname = trainname;
        this.trainpeople = trainpeople;
        this.traintime = traintime;
    }

    @Override
    public String toString() {
        return "train{" +
                "id=" + id +
                ", trainname='" + trainname + '\'' +
                ", trainpeople='" + trainpeople + '\'' +
                ", traintime=" + traintime +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }

    public String getTrainpeople() {
        return trainpeople;
    }

    public void setTrainpeople(String trainpeople) {
        this.trainpeople = trainpeople;
    }

    public int getTraintime() {
        return traintime;
    }

    public void setTraintime(int traintime) {
        this.traintime = traintime;
    }
}
