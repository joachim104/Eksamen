package com.company;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer
{
    public static void main(String[] args)
    {
        try
        {
            //Her opretter vi en DatagramSocket
            DatagramSocket datagramSocket = new DatagramSocket(9999);
            System.out.println("DatagramSocket created");

            // Her laver vi et byte array med størelsen 1024. det vil sige det kan indeholde 1024 karaktere.
            byte[] receiveArr = new byte[1024];

            // En datagram packet er bare en container til at indeholde information. den er tom som standard indtil vi kalder receive metoden
            DatagramPacket datagramPacket = new DatagramPacket(receiveArr, receiveArr.length);

            // Denne metode fylder containeren/datagram packet med byte arrayet.
            datagramSocket.receive(datagramPacket);

            // Her laver vi en string til at modtage beskeder fra klienten. vi kan ikke bare printe hele arrayet eftersom hvis der kun bliver sendt 200 bits
            // så kan den ikke printe arrayet ud fordi der er en masse tomme pladser. derfor siger vi "0, datagramPacket.getLength()"
            String message = new String(receiveArr, 0,datagramPacket.getLength());
            System.out.println("Received from client: " + message);
        }
        catch (Exception e)
        {

        }

    }
}
