import java.util.*;

/**
 * Created by vallep on 5/29/2017.
 *
 */
class MyTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("Timer task executed.");
    }
}

public class TimerDemo {
    public static void main(String[] arg) {
        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer = new Timer();

        myTimer.schedule(myTask, 1000, 500);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myTimer.cancel();
    }
}
