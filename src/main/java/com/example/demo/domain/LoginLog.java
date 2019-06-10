package com.example.demo.domain;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable{
    private int loginLogId;

    private int userId;

    private String ip;

    private Date loginDateTime;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginDate() {
        return loginDateTime;
    }

    public void setLoginDate(Date loginDateTime) {
        this.loginDateTime = loginDateTime;
    }

    public int getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
