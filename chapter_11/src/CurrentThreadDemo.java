/**
 * Created by valle on 24/04/2017.
 *
 */
public class CurrentThreadDemo {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();

        System.out.println("Current thread: " + t);

        t.setName("My Thread");
        System.out.println("After name change: " + t);

        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}