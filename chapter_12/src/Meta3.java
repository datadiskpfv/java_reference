/**
 * Created by vallep on 5/7/2017.
 *
 */
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno3 {
    String str() default "Testing";
    int val() default 9000;
}

public class Meta3 {
    @MyAnno3()

    public static void myMeth() {
        Meta3 ob = new Meta3();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno3 anno = m.getAnnotation(MyAnno3.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found.");
        }
    }

    public static void main(String args[]) {
        myMeth();
    }
}
