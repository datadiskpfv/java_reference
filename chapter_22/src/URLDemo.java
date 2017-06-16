import java.net.*;
/**
 * Created by vallep on 16/06/2017.
 *
 */
public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("http://www.datadisk.co.uk:80/index.html");

        System.out.println("Protocol: " + hp.getProtocol());
        System.out.println("Port: " + hp.getPort());

        System.out.println("Host:" + hp.getHost());
        System.out.println("File: " + hp.getFile());
        System.out.println("Ext: " + hp.toExternalForm());
    }
}