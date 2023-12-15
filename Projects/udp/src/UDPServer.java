import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(8080);

        byte[] recvBufferServer = new byte[1024];
        
        while (true) {
            DatagramPacket dpReceive = new DatagramPacket(recvBufferServer, recvBufferServer.length);
            ds.receive(dpReceive);
            String outPut = new String(recvBufferServer);
            System.out.println(outPut);

            if (new String(recvBufferServer).equals("Bye")) {
                System.out.println(1);
                ds.close();
                return;
            }
        }
    }
}

