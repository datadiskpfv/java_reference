import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by valle on 10/06/2017.
 */
public class FileDemo1 {
    public static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        // lets play around with a file
        File f1 = new File("C:/java_projects/COPYRIGHT.txt");

        System.out.println("File attributes");
        System.out.println("----------------------------------");
        p("File Name: " + f1.getName());
        p("Path: " + f1.getPath());
        p("Abs Path: " + f1.getAbsolutePath());
        p("Parent: " + f1.getParent());
        p(f1.exists() ? "exists" : "does not exists");
        p(f1.canWrite() ? "is writable" : "is not writable");
        p(f1.canRead() ? "is readable" : "is not readable");
        p("is " + (f1.isDirectory() ? "" : "not" + " a directory"));
        p(f1.isAbsolute() ? "is absolute" : "is not absolute");
        p("File last modified: " + f1.lastModified());
        p("File size: " + f1.length() + " Bytes");

        f1 = new File("C:/java_projects");

        System.out.println("\n\nDirectory attributes");
        System.out.println("---------------------------------");
        p("Directory Name: " + f1.getName());
        p("Path: " + f1.getPath());
        p("Abs Path: " + f1.getAbsolutePath());
        p("Parent: " + f1.getParent());
        p(f1.exists() ? "exists" : "does not exists");
        p(f1.canWrite() ? "is writable" : "is not writable");
        p(f1.canRead() ? "is readable" : "is not readable");
        p("is " + (f1.isDirectory() ? "" : "not") + "a directory");
        p(f1.isAbsolute() ? "is absolute" : "is not absolute");
        p("File last modified: " + f1.lastModified());
        p("File size: " + f1.length() + " Bytes");

        String s[] = f1.list();
        for (int i = 0; i < s.length; i++) {
            File f = new File("/java_projects/" + s[i]);
            if(f.isDirectory()) {
                p("Directory in directory: " + f.getName());
            }
            else {
                p("File in directory: " + f.getName());
            }
        }

        File d1 = new File("C:/java_projects/java_test_dir/test");
        p(d1.mkdirs() ? "new directory created" : "failed to create new directory");

        System.out.printf("%-20s %s", "Hello", "World!");
    }
}