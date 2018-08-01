package arithmetic;

import java.util.Scanner;

public class MyCalculator implements AdvancedArithmetic {

    public int divisor_sum(int n){

        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        MyCalculator mc = new MyCalculator();
        int num;
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        if(num<1000)
        {
            System.out.println("Sum of divisors is: "+mc.divisor_sum(num));
        }
        else
            System.out.println("Number out of range!");
    }
}
