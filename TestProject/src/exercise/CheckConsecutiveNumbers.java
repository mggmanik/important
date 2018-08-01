package exercise;

import java.util.Scanner;

public class CheckConsecutiveNumbers{

    public static void main(String[] args) {

        String seriesStr;
        System.out.println("Enter Series: ");
        Scanner in = new Scanner(System.in);
        seriesStr = in.nextLine();

        checkSeries(seriesStr);

    }

    public static void checkSeries(String seriesStr)
    {
        String[] series = seriesStr.split(",");
        int count=0,count1=0;
        int[] ser = new int[series.length];
        for(int i=0;i<series.length;i++)
        {
            ser[i]=Integer.parseInt(series[i]);
        }

        for(int i=1;i<series.length;i++)
        {
            if((ser[i]-ser[i-1]==1) && (series.length>=7))
            {
                count++;
            }
            else
            if((ser[i-1]-ser[i]==1) && (series.length>=7))
            {
                count1++;
            }
            else {
                count=0;
                count1=0;
            }
        }

        if(count>=6 || count1>=6)
        {
            System.out.println(seriesStr+" are consecutive numbers.");
        }
        else
            System.out.println(seriesStr+" non consecutive numbers or less than 7 digits.");
    }
}
