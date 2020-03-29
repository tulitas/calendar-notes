package com.controllers;


import java.io.*;
import java.net.Socket;
import java.util.Scanner;

class Sms {
    private static ParallelScanner in;
    private static PrintStream out;
    private makeSms makeSms = new makeSms();


    void Savienojums() {
        try {
            Socket socket = new Socket("192.168.6.80", 5038);
            out = new PrintStream(socket.getOutputStream());
            in = new ParallelScanner(new Scanner(socket.getInputStream()));
            in.start();


            String line = in.nextLine();
            if (line.equals("Asterisk Call Manager/1.1")) {
                System.out.println("connected");
                connection();

            } else {
                System.out.println("No cennection");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void connection() {

        out.print("Action: login" + "\r\nUsername: apiuser" + "\r\nSecret: apipass" + "\r\n\r\n");
        readFromDevice();


    }

    private void readFromDevice() {
        System.out.println(1);
        while (in.hasNext()) {
            String line = in.nextLine();
            System.out.println(line);
            if (line.equals("Message: Authentication accepted")) {
                System.out.println("davaj");

            }
        }


    }



}