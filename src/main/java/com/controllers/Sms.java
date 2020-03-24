package com.controllers;


import java.io.*;
import java.net.Socket;
import java.util.Scanner;

class Sms {
    private static ParallelScanner in;
    private static PrintStream out;
    private makeSms makeSms = new makeSms();

    void Savienojums() {
        System.out.println("hi");
        try {
            Socket socket = new Socket("192.168.6.80", 5038);
            System.out.println("1");
            out = new PrintStream(socket.getOutputStream());
            in = new ParallelScanner(new Scanner(socket.getInputStream()));
            in.start();
            System.out.println(in);
            connection(socket, out, in);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void connection(Socket socket, PrintStream out, ParallelScanner in) {
        System.out.println("hi2");
        out.print("Action: login" + "\r\nUsername: apiuser" + "\r\nSecret: apipass" + "\r\n\r\n");
        while (in.hasNext()) {
            String line = in.nextLine();
            if (line.equals("Message: Authentication accepted")) {
                sendSms();
            }
        }
    }

    private void sendSms() {

        System.out.println(132132);


    }

}