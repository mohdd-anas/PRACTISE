package ARRAY.QUESTION;
import java.util.*;

public class v_max {
    public static void main(String[] args)
    {
        int[] arr={4,2,5,1,7,3};
        int a= max(arr);
        System.out.println(a);
    }
    static int max(int[] arr)
    {
        int max=arr[1];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
