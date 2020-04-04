package com.SmsMaker;


import java.io.*;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.*;


public class SmsConnect extends TimerTask {
    private static ParallelScanner in;
    private static PrintStream out;
    private static Socket socket;
    private String rememberSms;
    private Date date = new Date();
    private SimpleDateFormat formatForDate = new SimpleDateFormat("ddMMyy,HHmm");
    private SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yy,HH:mm:ss");
    @Override
    public void run() {
        System.out.println("TimerTask начал свое выполнение в:");
        completeTask();
        System.out.println("TimerTask закончил свое выполнение в:");
        runTimer();
    }

    private void completeTask() {
        try {
            // допустим, выполнение займет 20 секунд
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void runTimer() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                try {
                    readFromDevice();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        };
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 10 * 1000);
        System.out.println("na4al vipolnenie");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void Savienojums() {
      String  rememberSms1 = "Action: smscommand\r\ncommand: gsm send sms 2 " + rememberSms
                + " \"12345 status\" " + "\r\n\r\n";
        System.out.println(rememberSms1);
        try {
            socket = new Socket("192.168.6.80", 5038);
            out = new PrintStream(socket.getOutputStream());
            in = new ParallelScanner(new Scanner(socket.getInputStream()));
            in.start();
            runTimer();

            out.print("Action: login" + "\r\nUsername: apiuser" + "\r\nSecret: apipass" + "\r\n\r\n");
            readFromDevice();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private void readFromDevice() throws IOException {

        try {


            String line = in.nextLine();
            while (in.hasNext()) {
                if (line.equals("Message: Authentication accepted")) {
                    System.out.println(rememberSms+ "otpravil");
                    socket.close();
                    System.out.println("soedinenie zakrito");
//                return;
                }
            }
        } catch
        (NoSuchElementException e) {
            e.printStackTrace();
        }

    }

    private String getRememberSms() {
        return rememberSms;
    }

    public void setRememberSms(String rememberSms) {
        this.rememberSms = rememberSms;
    }

    @Override
    public String toString() {
        return "SmsConnect{" +
                "rememberSms='" + rememberSms + '\'' +
                '}';
    }
}
