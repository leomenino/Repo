import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();

        InetAddress ip = InetAddress.getLocalHost();

        Socket clientSocket = new Socket(ip,8080);
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        out.print(inp);
        in.read();
    }
}
