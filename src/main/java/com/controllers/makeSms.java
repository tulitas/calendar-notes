package com.controllers;

 class makeSms {

    private String rememberSms = ("hello");

    public String getRememberSms() {
        return rememberSms;
    }

    public void setRememberSms(String rememberSms) {
        this.rememberSms = rememberSms;
    }

    @Override
    public String toString() {
        return "makeSms{" +
                "rememberSms='" + rememberSms + '\'' +
                '}';
    }
}
