/**
 * Created by vallep on 4/15/2017.
 */
public class TwoDArray {
    public static void main(String args[]) {

        // create the array and the variables needed
        int twoD[][] = new int[4][5];
        int i, j, k = 0;

        // fill the array with values
        for (i = 0; i < 4; i++)
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }

        // display the array
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}