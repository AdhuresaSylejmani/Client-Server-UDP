import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class UdpClient2 {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {

        Scanner input = new Scanner(System.in);
        // Krijimi i socket
        DatagramSocket diagramiSocket = new DatagramSocket();

        // Destimi i IP Serverit
        InetAddress ipAdresa = InetAddress.getByName("localhost");

      