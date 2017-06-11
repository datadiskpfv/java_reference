import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by valle on 11/06/2017.
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);

        Address = InetAddress.getByName("www.datadisk.co.uk");
        System.out.println(Address);
    }
}