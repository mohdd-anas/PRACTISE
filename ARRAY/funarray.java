package ARRAY;

import java.util.Arrays;

public class funarray {
    public static void main(String[] args) {
        int[] arr={2,46,7,23,4};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] carr)
    {
        carr[0]=99;
    }
}
