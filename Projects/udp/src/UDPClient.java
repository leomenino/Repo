import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getLocalHost();
        byte[] sendBuffer;

        while (true) {
            String inp = sc.nextLine();
            sendBuffer = inp.getBytes();

            DatagramPacket DpSend = new DatagramPacket(sendBuffer, sendBuffer.length, ip, 8080);
            ds.send(DpSend);


            if (inp.equals("Bye")) {
                ds.close();
                return;
            }
        }
    }
}
