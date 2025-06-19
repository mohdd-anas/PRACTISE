package ARRAY;

import java.util.*;

public class matrix {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int row,col;
        System.out.println("ENTER ROW AND COL");
        row=in.nextInt();
        col=in.nextInt();

        int[][] arr=new int[row][col];

        for(int i=0;i<arr.length;i++)//array within array {{1,2,3,4},{3,4,56,65}} //array of array
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }

        for(int i=0;i<arr.length;i++)//array within array {{1,2,3,4},{3,4,56,65}} //array of array
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }



        int  ar[][]={
                {1,2,3},
                {4,5},
                {9}

        };

        for(row=0;row<ar.length;row++)
        {
            for(col=0;col<ar[row].length;col++)
            {
                System.out.print(ar[row][col]+" ");
            }
            System.out.println("\n");
        }

    }
}
