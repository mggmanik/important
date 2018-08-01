package classes;

import java.util.Scanner;

public class Class2 extends Class1 {

    public int mul(int a, int b)
    {
        return a*b;
    }

    public int task(int a, int b)
    {
        Class2 obj = new Class2();
        int square;
        square = obj.add(obj.mul(a,a),obj.mul(b,b));
        return square;
    }

    public static void main(String[] args) {

        int n,a,b;
        System.out.println("Enter the number of inputs: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Class2[] obj = new Class2[n];
        for (int i =0;i<n;i++)
        {
            obj[i] = new Class2();
            System.out.println("Enter the numbers: ");
            a = in.nextInt();
            b = in.nextInt();
            System.out.println(obj[i].add(a,b));
            System.out.println(obj[i].mul(a,b));
            System.out.println(obj[i].task(a,b));
        }
    }
}
