package ARRAY.QUESTION;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        //for(int i=0;i<(arr.length)/2;i++)
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start=start+1;
            end=end-1;
        }
    }

}
