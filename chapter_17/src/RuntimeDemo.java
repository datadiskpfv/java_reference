/**
 * Created by vallep on 5/25/2017.
 */
public class RuntimeDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();

        System.out.println("Total memory: "  + r.totalMemory());
        System.out.println("Free memory: "  + r.freeMemory());
        r.gc();
        System.out.println("Free memory: "  + r.freeMemory());
        Process p = null;
        try {
            p = r.exec("notepad");
            p.waitFor();
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Notepad has terminated....");

        try {
            ProcessBuilder proc = new ProcessBuilder("notepad.exe", "c:\\java_projects\\testfile");
            proc.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
