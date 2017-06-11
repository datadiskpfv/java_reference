import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by valle on 11/06/2017.
 *
 */
public class Whois {
    public static void main(String[] args) {
        int c;

        try ( Socket s = new Socket("whois.nic.uk", 43) ) {

            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();

            String str = (args.length == 0 ? "datadisk.co.uk" + "\r\n" : args[0]) + "\r\n";
            byte buf[] = str.getBytes();

            out.write(buf);

            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        }
        catch (Exception e) {
            System.out.println("Could not open socket");
            System.out.println(e);
        }
    }
}
