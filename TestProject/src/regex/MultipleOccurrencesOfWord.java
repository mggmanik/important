package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurrencesOfWord {

    public static void check(String str)
    {
        Pattern p = Pattern.compile("se");
        Matcher m = p.matcher(str);

        while(m.find())
        {
            System.out.println("Found at: "+m.start()+" - "+(m.end()));
        }
    }

    public static void main(String[] args) {

        String str;
        System.out.println("Enter the String containing Harry: ");
        Scanner in = new Scanner(System.in);
        str = in.nextLine();

        check(str);
    }
}