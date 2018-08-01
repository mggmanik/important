package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckHarry {

    public static boolean check(String str)
    {
        Pattern p = Pattern.compile("Harry");
        Matcher m = p.matcher(str);

        return m.find();
    }

    public static void main(String[] args) {

        String str;
        System.out.println("Enter the String containing Harry: ");
        Scanner in = new Scanner(System.in);
        str = in.nextLine();

        System.out.println("Is Harry here? "+check(str));
    }
}
