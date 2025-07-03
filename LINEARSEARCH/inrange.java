package LINEARSEARCH;
import java.util.*;
public class inrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("ENTER NUMBER");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int start=0,end=0,target=0;
        System.out.println("GIVE START,END,TARGET VALUE");
        start=sc.nextInt();
        end=sc.nextInt();
        target=sc.nextInt();
        System.out.println(search(start,end,target,arr));
    }

    static boolean search(int start,int end,int target,int[] arr)
    {
        for(int i=start;i<=end;i++)
        {
            if(target==arr[i])
            {
                return true;
            }
        }
        return false;
    }


}
