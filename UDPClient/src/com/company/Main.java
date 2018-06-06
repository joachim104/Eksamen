package com.company;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            // UDP er i dette tilfælde Simplex modsat TCP som er full-duplex. Her er det kun den ene server der kan sende
            DatagramSocket datagramSocket = new DatagramSocket();
            System.out.println("Client: datagramSocket created");

            byte[] sendArray = "Hello Server!!!!! ".getBytes();

            //Det er til at kommunikere lokalt på computeren.
            InetAddress address = InetAddress.getByName("localhost");
            //InetAddress address = InetAddress.getByName("169.254.230.62");
            int port = 9999;

            DatagramPacket datagramPacket = new DatagramPacket(sendArray, sendArray.length, address, port);

            datagramSocket.send(datagramPacket);
        }
        catch (Exception e)
        {

        }
    }
}
