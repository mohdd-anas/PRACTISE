package LINEARSEARCH;

public class search {
    public static void main(String[] args)
    {
        int[] arr={2,6,5,9,45,13,1};
        int target=44;
        int result=linearsearch(arr,target);
        System.out.println(result);
    }
    static int linearsearch(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;

        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }


}
