/**
 * Created by valle on 06/05/2017.
 */
class AD {
    synchronized void foo(BD b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered A.foo");

        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            System.out.println("A Interrupted");
        }

        System.out.println(name + " trying to call B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("Inside A.class");
    }
}

class BD {
    synchronized void bar(AD a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered B.bar");

        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            System.out.println("B Interrupted");
        }

        System.out.println(name + " trying to call A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("Inside B.class");
    }
}
public class Deadlock implements Runnable {
    AD a = new AD();
    BD b = new BD();

    Deadlock() {
        System.out.println("In deadlock contructor");
        Thread.currentThread().setName("MainThread");
        Thread t = new Thread(this, "RacingThread");
        t.start();

        a.foo(b);
        System.out.println("Back in the main thread");
    }

    public void run() {
        b.bar(a);
        System.out.println("Back in the other thread");
    }

    public static void main(String args[]) {
        new Deadlock();
    }
}
