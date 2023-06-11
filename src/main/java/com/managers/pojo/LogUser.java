package com.managers.pojo;

public class LogUser {
    //用户名
    private String username;
    //密码
    private String password;

    @Override
    public String toString() {
        return "LogUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public LogUser() {
    }

    public LogUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
