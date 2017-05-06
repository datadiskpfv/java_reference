/**
 * Created by valle on 06/05/2017.
 */

class ThreadState implements Runnable {

    ThreadState() {
        Thread t1 = new Thread(this, "thread_one");
        Thread t2 = new Thread(this, "thread_two");

        System.out.println("Thread t1 State (in constructor): " + t1.getState());
        System.out.println("Thread t2 State (in constructor): " + t2.getState());

        t1.start();
        t2.start();
    }

    public void run() {
        Thread thread = Thread.currentThread();
        String name = Thread.currentThread().getName();

        System.out.println("Thread Name: " + name);
        System.out.println("Thread State (in run): " + thread.getState());

        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }

    public static void main(String args[]) {
       new ThreadState();
    }
}