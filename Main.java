package com.company;

import java.io.IOException;
import java.net.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        try {
            DatagramSocket data = new DatagramSocket(1095);
            Date currentDate = new Date();

            while(true) {
                System.out.println(currentDate.toString().length());
                byte [] buf = new byte[currentDate.toString().length()];
                DatagramPacket packet = new DatagramPacket(buf, buf.length);
                data.send(packet);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
