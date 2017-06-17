import java.util.concurrent.*;
/**
 * Created by vallep on 17/06/2017.
 *
 */
public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction()) ;

        System.out.println("Starting");

        new MyThread1(cb, "A");
        new MyThread1(cb, "B");
        new MyThread1(cb, "C");
        new MyThread1(cb, "X");
        new MyThread1(cb, "Y");
        new MyThread1(cb, "Z");

        System.out.println("count: " + Shared1.count);
    }
}

class Shared1 {
    static int count = 0;
}

class MyThread1 implements Runnable {
    CyclicBarrier cbar;
    String name;

    MyThread1(CyclicBarrier c, String n) {
        cbar = c;
        name = n;
        new Thread(this).start();
    }

    public void run() {
        System.out.println(name);
        //Shared1.count++;

        try {
            cbar.await();
            Shared1.count++;
        } catch (BrokenBarrierException e) {
            System.out.println(e);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class BarAction implements Runnable {
    public void run() {
        System.out.println("Barrier Reached!");
    }
}