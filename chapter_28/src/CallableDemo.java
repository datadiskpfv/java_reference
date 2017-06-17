import java.util.concurrent.*;
/**
 * Created by vallep on 17/06/2017.
 *
 *
 */
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<Integer> f;
        Future<Double> f2;
        Future<Integer> f3;

        System.out.println("Starting");

        f = es.submit(new Sum(10));
        f2 = es.submit(new Hypot(3,4));
        f3 = es.submit(new Factorial(5));

        try {
            System.out.println(f.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
        } catch (InterruptedException e) {
            System.out.println(e);
        } catch (ExecutionException e) {
            System.out.println(e);
        }

        es.shutdown();
        System.out.println("Done");
    }
}

class Sum implements Callable<Integer> {
    int stop;
     Sum (int v) { stop = v; }

     public Integer call() {
         int sum = 0;
         for (int i = 0; i < stop; i++) {
             sum += 1;
         }
         return sum;
     }
}

class Hypot implements Callable<Double> {
    double side1, side2;

    Hypot(double s1, double s2) {
        side1 = s1;
        side2 = s2;
    }

    public Double call() {
        return Math.sqrt((side1*side2) +(side1*side2));
    }
}

class Factorial implements Callable<Integer> {
    int stop;

    Factorial(int v) { stop = v;}

    public Integer call() {
        int fact = 1;
        for (int i = 2 ; i <= stop; i++) {
            fact *= i;
        }
        return fact;
    }
}