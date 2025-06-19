package ARRAY;
import java.util.*;
public class multidimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                arr[row][col] = in.nextInt();

            }
        }

        for (int row = 0; row < 3; row++) {


            for (int col = 0; col < 3; col++) {
                System.out.print(arr[row][col]);


                //System.out.println(Arrays.toString(arr));
            }


        }
    }
}