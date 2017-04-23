/**
 * Created by vallep on 4/23/2017.
 */
public class FinallyDemo {

    static void tryme() throws Exception {
        try {
            System.out.println("tryme method");
            throw new Exception("tryme exception");
        } catch (Exception e) {
            System.out.println("exception caught in tryme " + e.getMessage());
            throw e;
        } finally {
            System.out.println("tryme finally block");
        }
    }

    public static void main(String args[]) {
        try {
            System.out.println("Main try block");
            tryme();
        } catch (Exception e) {
            System.out.println("Main catch block");
        } finally {
            System.out.println("Main finally block");
        }
        System.out.println("Main finished");
    }
}
