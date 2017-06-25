/**
 * Created by vallep on 25/06/2017.
 *
 */

// Lazily loaded singleton, will only get created when needed
class Singleton1 {
    private static Singleton1 uniqueInstance;

    // used by the improved synchronized method below
    // private volatile static Singleton1 uniqueInstance;

    int count = 0;

    private Singleton1() {}

    // use synchronized to make thread-safe
    // however you have overhead of synchronized every access, may impact performance???
    public static synchronized Singleton1 getInstance() {
        if (uniqueInstance == null ){
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;

    }

    // below can help as only the first access will be synchronized, other access will just return the
    // the singleton, need to use the volatile keyboard as above

//    public static Singleton1 getInstance() {
//        if (uniqueInstance == null ){
//            synchronized (Singleton1.class) {
//                if (uniqueInstance == null ) {
//                    uniqueInstance = new Singleton1();
//                }
//            }
//        }
//        return uniqueInstance;
//    }

    public int getCount() {
        return  count;
    }

    public void addOneToCount() {
        count++;
    }


}

// This is a eagerly loaded singleton, will get created as soon as the class is loaded,
// it may never get used so a waste but dont have to have synchronization so better performance than above
// be careful when using multiple classloader's as it could be possible to load two singletons in each classloader
class Singleton2 {
  private static Singleton2 uniqueInstance2 = new Singleton2();

  int count = 0;

  private Singleton2() {}

  public static Singleton2 getInstance2() {
      return uniqueInstance2;
  }

    public int getCount() {
        return  count;
    }

    public void addOneToCount() {
        count++;
    }
}

public class SingletonDemo {

    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();

        System.out.println("S1 count " + s1.getCount());
        System.out.println("S2 count " + s2.getCount());

        s1.addOneToCount();
        s1.addOneToCount();

        System.out.println("S1 count " + s1.getCount());
        System.out.println("S2 count " + s2.getCount());

        s2.addOneToCount();
        s2.addOneToCount();

        System.out.println("S1 count " + s1.getCount());
        System.out.println("S2 count " + s2.getCount());

        System.out.println("==============================================================");

        Singleton2 s3 = Singleton2.getInstance2();
        Singleton2 s4 = Singleton2.getInstance2();

        System.out.println("S3 count " + s3.getCount());
        System.out.println("S4 count " + s4.getCount());

        s3.addOneToCount();
        s3.addOneToCount();

        System.out.println("S3 count " + s3.getCount());
        System.out.println("S4 count " + s4.getCount());

        s4.addOneToCount();
        s4.addOneToCount();

        System.out.println("S3 count " + s3.getCount());
        System.out.println("S4 count " + s4.getCount());
    }
}
