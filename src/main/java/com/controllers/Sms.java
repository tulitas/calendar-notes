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

            connection(socket, out, in);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void connection(Socket socket, PrintStream out, ParallelScanner in) {
        out.print("Action: login" + "\r\nUsername: apiuser" + "\r\nSecret: apipass" + "\r\n\r\n");
        System.out.println(0.1);
        while (in.hasNext()) {
            System.out.println(0.2);
            String line = in.nextLine();
            System.out.println(1);
            if (line.equals("Message: Authentication accepted")) {
                System.out.println("Connected");
                sendSms();
            }
        }
    }

    private void sendSms() {

        System.out.println("hello Sergej");


    }

}