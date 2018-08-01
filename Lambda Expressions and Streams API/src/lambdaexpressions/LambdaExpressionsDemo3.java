package lambdaexpressions;

public class LambdaExpressionsDemo3 {

    public static int operate(int a, int b, FuncInter1 fobj)
    {
        return fobj.operation(a, b);
    }

    public static void main(String args[])
    {
//      Paranthesis required because more than one parameter is there.
        FuncInter1 add = (int x, int y) -> x + y;

        FuncInter1 multiply = (int x, int y) -> x * y;


        System.out.println("Addition is " +
                operate(6, 3, add));

        System.out.println("Multiplication is " +
                operate(6, 3, multiply));

    }
}
