import java.util.Scanner;

public class StringReplace {

    public static String replaceStr(String str)
    {
        str = str.replaceAll("\\bis\\b", "is not");

        return str ;
    }

    public static void main(String[] args) {

        String str;
        System.out.println("Enter a String: ");
        Scanner in = new Scanner(System.in);
        str = in.nextLine();

        System.out.println("Given String: "+str);
        System.out.println("Modified String: "+replaceStr(str));
    }
}
