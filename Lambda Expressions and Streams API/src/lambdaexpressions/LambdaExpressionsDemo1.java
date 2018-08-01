package lambdaexpressions;

public class LambdaExpressionsDemo1 {

    public static void main(String[] args) {
        String something = "I am using a Functional interface!";

//      Using Anonymous InnerClass
        Printer printer = new Printer() {
            @Override
            public void print(String val) {
                System.out.println(val);
            }
        };

        printer.print(something);
    }
}

