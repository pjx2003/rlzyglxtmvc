package com.managers.pojo;

public class Trains {
    private int id;
    private String trainname;
    private String trainpeople;
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
