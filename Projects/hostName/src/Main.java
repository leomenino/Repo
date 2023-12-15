import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException, IOException {
        InetAddress inetAddress = InetAddress.getByName("www.wikipedia.com");

        System.out.println(inetAddress.isReachable(2000));

        InetAddress abola = InetAddress.getByName("www.abola.pt");

        System.out.println(abola.isReachable(1000));

        InetAddress gmail = InetAddress.getByName("www.gmail.com");
        System.out.println(gmail.isReachable(1000));
        System.out.println(abola.getHostAddress());
        System.out.println(abola.hashCode());
        System.out.println(abola.getAddress());
        System.out.println(abola.getCanonicalHostName());
        System.out.println(abola.getHostName());

    }
}
