/**
 * Created by vallep on 5/13/2017.
 *
 */
import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;

        if(args.length != 1) {
            System.out.println("Usage: Showfile filename");
            return;
        }

        System.out.println("File: " + args[0]);

        // java will automatic close the resources in the try block
        try (FileInputStream fin = new FileInputStream(args[0])) {

            do {
                i = fin.read();
                if(i != -1) System.out.println((char) i);
            } while(i != -1);
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        } catch(IOException e) {
            System.out.println("An I/O Error Occurred");
        }
    }
}
