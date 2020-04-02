package com.SmsMaker;


import com.config.DataBaseConnectionForSms;

import java.sql.SQLException;

public class MakeSms {
    private DataBaseConnectionForSms dataBaseConnectionForSms = new DataBaseConnectionForSms();

    public void Run() throws SQLException, ClassNotFoundException {
        dataBaseConnectionForSms.Connect();
    }


    private String rememberSms = ("hello");

    String getRememberSms() {
        return rememberSms;
    }

    public void setRememberSms(String rememberSms) {
        this.rememberSms = rememberSms;
    }

    @Override
    public String toString() {
        return "MakeSms{" +
                "rememberSms='" + rememberSms + '\'' +
                '}';
    }
}
