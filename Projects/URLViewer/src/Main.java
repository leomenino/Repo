import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://codeforall.com");

        InputStream inputStream = url.openStream();
        BufferedReader inp = new BufferedReader(new InputStreamReader(inputStream));
        String cont = "";
        //System.out.println(1);
        while ((cont =inp.readLine()) != null) {
            //System.out.println(2);
            System.out.println(cont);
            //System.out.println(3);
        }
        inp.close();
        }
}
