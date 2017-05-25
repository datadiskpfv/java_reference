/**
 * Created by vallep on 5/25/2017.
 */
public class CharacterDemo {
    public static void main(String[] args) {
        char[] a = {'a','b','5','?','A',' '};

        for (int i = 0; i < a.length; i++) {
            if(Character.isDigit(a[i]))
                System.out.println(a[i] + " is digit");
            if(Character.isLetter(a[i]))
                System.out.println(a[i] + " is letter");
            if(Character.isWhitespace(a[i]))
                System.out.println(a[i] + " is Whitespace");
            if(Character.isUpperCase(a[i]))
                System.out.println(a[i] + " is Upper case");
            if(Character.isLowerCase(a[i]))
                System.out.println(a[i] + " is Lower case");
        }

        Character[] b = {'a','b','5','?','A',' '};
        for (int i = 0; i < b.length; i++) {
            System.out.println("Hash Code: " + b[i].hashCode());
        }
    }
}
