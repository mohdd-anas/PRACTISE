package LINEARSEARCH;

public class searchintwodarray {
    public static void main(String[] args)
    {
        int[][] arr= {
                {15, 23, 6},
                {43, 11, 89, 25},
                {55, 12},
                {45, 68, 99}
        };

        int target=142;
        System.out.println(search(arr,target));
    }

    static boolean search(int[][] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
