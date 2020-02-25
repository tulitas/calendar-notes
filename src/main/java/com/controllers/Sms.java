package com.controllers;


import com.GuestBook;

import java.io.*;
import java.net.Socket;
import java.util.Properties;
import java.util.Scanner;

class Sms {
    private static ParallelScanner in;
    private static PrintStream out;

    void Savienojums() {
        System.out.println("hi");
        try {
            Socket socket = new Socket("192.168.6.80", 5038);
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
        out.print("Action: login" + "\r\nUsername: apiuser" + "\r\nSecret: apipass" + "\r\n\r\n");
        System.out.println("Action: login" + "\r\nUsername: apiuser" + "\r\nSecret: apipass" + "\r\n\r\n");
        System.out.println(in);
//        enterPassword(socket, out, in);
//        readFromDevice();


    }

//    private void enterPassword(Socket socket, PrintStream out, ParallelScanner in) {
//        final Properties properties = new Properties();
//        try
//                (InputStream is = GuestBook.class.getResourceAsStream("config.properties.login")) {
//            properties.load(is);
//            String login = properties.getProperty("cp.action");
//            String username = properties.getProperty("cp.username");
//            String secret = properties.getProperty("cp.secret");
//            out.print("Action: " + login + "\r\nUsername: " + username + "\r\nSecret: " + secret + "\r\n\r\n");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}