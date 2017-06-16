import java.net.*;
import java.io.*;
import java.util.Date;
/**
 * Created by vallep on 16/06/2017.
 *
 */
public class UCDemo {
    public static void main(String[] args) throws Exception {
        int c;
        URL hp = new URL("http://www.datadisk.co.uk");
        URLConnection hpCon = hp.openConnection();

        long d = hpCon.getDate();
        if (d == 0)
            System.out.println("No date information");
        else
            System.out.println("Date: " + new Date(d));

        System.out.println("Content-Type: " + hpCon.getContentType());

        d = hpCon.getExpiration();
        if (d == 0)
            System.out.println("No Expiration information");
        else
            System.out.println("Expires: " + new Date(d));

        d = hpCon.getLastModified();
        if (d == 0)
            System.out.println("No last-modified information");
        else
            System.out.println("Last-Modified: " + new Date(d));

        long len = hpCon.getContentLengthLong();
        if (len == -1)
            System.out.println("Content length unavailable");
        else
            System.out.println("Content-Length: " + len);

        if (len != 0) {
            System.out.println("=== Content ===");
            InputStream input = hpCon.getInputStream();
            while (((c = input.read()) != -1)) {
                System.out.print((char) c);
            }
            input.close();
        } else {
            System.out.println("No content available");
        }
    }
}