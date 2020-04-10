package com.SmsMaker;


import java.io.*;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.*;


public class SmsConnect extends TimerTask {
    private static ParallelScanner in;
    private static PrintStream out;
    private static Socket socket;
    private String rememberSmsCustomerPhone;
    private String rememberSmsCustomerName;
    private String remerberSmsCustomerCar;
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
        timer.scheduleAtFixedRate(timerTask, 0, 10 * 500);
        System.out.println("na4al vipolnenie");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void Savienojums() {
//
//        System.out.println(rememberSms1);

        try {

            socket = new Socket("192.168.6.80", 5038);
            out = new PrintStream(socket.getOutputStream());
            in = new ParallelScanner(new Scanner(socket.getInputStream()));
            in.start();
            enterPass();
//            readFromDevice();
            runTimer();

//



        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void enterPass() throws IOException {
        out.print("Action: login" + "\r\nUsername: apiuser" + "\r\nSecret: apipass" + "\r\n\r\n");
        readFromDevice();
    }


    private void readFromDevice() throws IOException {
        String  rememberSms1 = "Action: smscommand\r\ncommand: gsm send sms 2 " + rememberSmsCustomerPhone + " "
                + rememberSmsCustomerName  + " " + remerberSmsCustomerCar + " 1" + "\r\n\r\n";
        System.out.println(rememberSms1);
        try {


            String line = in.nextLine();
            while (in.hasNext()) {
                if (line.equals("Message: Authentication accepted")) {

                    out.print(rememberSms1);

                    socket.close();
                    System.out.println("soedinenie zakrito");
break;
                }
                if (line.equals("Status: 1")){
                    System.out.println("Sms Sendet" + "\n");
                }
                if (line.equals("Status: 0")){
                    System.out.println("Send error");
                }
            }
        } catch
        (NoSuchElementException e) {
            e.printStackTrace();
        }

    }

    private String getRememberSmsCustomerPhone() {
        return rememberSmsCustomerPhone;
    }

    public void setRememberSmsCustomerPhone(String rememberSmsCustomerPhone) {
        this.rememberSmsCustomerPhone = rememberSmsCustomerPhone;
    }

    public String getRememberSmsCustomerName() {
        return rememberSmsCustomerName;
    }

    public void setRememberSmsCustomerName(String rememberSmsCustomerName) {
        this.rememberSmsCustomerName = rememberSmsCustomerName;
    }

    public String getRemerberSmsCustomerCar() {
        return remerberSmsCustomerCar;
    }

    public void setRemerberSmsCustomerCar(String remerberSmsCustomerCar) {
        this.remerberSmsCustomerCar = remerberSmsCustomerCar;
    }

    @Override
    public String toString() {
        return "SmsConnect{" +
                "rememberSmsCustomerPhone='" + rememberSmsCustomerPhone + '\'' +
                ", rememberSmsCustomerName='" + rememberSmsCustomerName + '\'' +
                ", remerberSmsCustomerCar='" + remerberSmsCustomerCar + '\'' +
                '}';
    }
}
