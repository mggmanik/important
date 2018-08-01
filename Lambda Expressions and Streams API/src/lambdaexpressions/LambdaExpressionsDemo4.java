package lambdaexpressions;

public class LambdaExpressionsDemo4 {

    public static void main (String args[]) {

//      We need to use curly braces if lambda expressions have more than one statement
        MyString reverseStr = (str) -> {
            String result = "";

            for(int i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };

        System.out.println(reverseStr.myStringFunction("Lambda Demo"));
    }
}
