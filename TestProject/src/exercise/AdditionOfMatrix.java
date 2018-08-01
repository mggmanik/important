package exercise;

import java.util.Scanner;

public class AdditionOfMatrix {

    public static void add2Matrix(int[][] arr,int[][] brr,int row,int column)
    {
        int[][] sum = new int[row][column];

        for(int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                sum[i][j]=arr[i][j]+brr[i][j];
                System.out.print(sum[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

        int row, column;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        row = in.nextInt();
        System.out.println("Enter the number of columns: ");
        column = in.nextInt();

        int[][] arr = new int[row][column];
        int[][] brr = new int[row][column];
        System.out.println("Enter for first Matrix:");
        for(int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter for second Matrix");
        for(int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                brr[i][j]=in.nextInt();
            }
        }
        System.out.println("Sum is: ");
        add2Matrix(arr,brr,row,column);

    }
}
