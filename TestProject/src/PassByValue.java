import java.util.Scanner;

public class PassByValue {

    public void value(int x)
    {
        x = 10;
    }
//Java is pass by value!
    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = in.nextInt();
        PassByValue obj = new PassByValue();
        obj.value(x);
        System.out.println(x);
    }
}
