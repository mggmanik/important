package lambdaexpressions;

public class LambdaExpressionsDemo2 {

    public static void main(String[] args) {

        String something = "Learning Lambda Expressions!";

//       Using Lambdas
        Printer printer = toPrint -> System.out.println(toPrint);

        printer.print(something);
    }
}
