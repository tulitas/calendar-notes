package com.SmsMaker;


import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class SmsConnect extends TimerTask {
    private static ParallelScanner in;
    private static PrintStream out;
    private MakeSms makeSms = new MakeSms();

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
                readFromDevice();
            }


        };
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 10 * 300);
        System.out.println("na4al vipolnenie");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

   public void Savienojums() {
        try {
            Socket socket = new Socket("192.168.6.80", 5038);
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


    private void readFromDevice() {


        String line = in.nextLine();
        while (in.hasNext()) {
            if (line.equals("Message: Authentication accepted")) {
                System.out.println("Action: smscommand\r\ncommand: gsm send sms 2 " + "29158366"
                        + " \"12345 status\" " + "01.02.2020" + "\r\n\r\n");
                return;
            }

        }
    }

}