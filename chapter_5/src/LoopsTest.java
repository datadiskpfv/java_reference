/**
 * Created by vallep on 4/16/2017.
 */
public class LoopsTest {
    public static void main(String args[]) {

        // its possible that the while loop may never run
        int n = 1;
        while( n <= 10) {
            System.out.println("answer: " + n);
            n++;
        }

        System.out.println();

        // a do-while loop will always run once as it is evaluated at the end of a run
        int o = 1;
        do {
            System.out.println("answer: " + o);
        } while(++o <= 10);

        System.out.println();

        // for loops are used to loop a specific number of times or loop through an array, etc
        // can use brackets for multi-lines
        for(int p=1; p <= 10; p++)
            System.out.println("answer: " + p);

       System.out.println();

       for(int q=1; q <= 10; q++) {
          System.out.println("answer: " + q);

          // break out of the loop when we hit five
          if (q == 5)
             break;
       }

       System.out.println();

       for(int r=1; r <= 10; r++) {
         // use modulus to skip odd numbers, continue will go back to the start of the loop
         if ((r % 2) == 1)
           continue;

         System.out.println("answer: " + r);
       }

       System.out.println();

       // foreach loop, you normally use a collection of some sort
       // you can use both break and continue
       int nums[] = { 1, 2, 3, 4,  5, 6, 7, 8, 9, 10 };

       for (int x : nums) System.out.println("answer: " + x);

       System.out.println();

       // use foreach loop with multi-dimension arrays
       int num_array[][] = new int[3][5];
       int count = 1;

       for(int i = 0; i < 3; i++)
           for( int j = 0; j < 5; j++) {
               num_array[i][j] = count;
               count++;
           }

       for(int y[] : num_array) {
           for(int z : y) {
               System.out.println("answer: " + z);
           }
       }

        System.out.println();

        for(int a=1; a <= 10; a++) {
            System.out.println("answer: " + a);

            // break out of the loop when we hit five, this time we use return
            if (a == 5)
                return;
        }

    }
}
