package regex;

import java.util.Scanner;

public class ReplaceAll {

    public static String replace(String original)
    {
        String rep = original.replaceAll("d","f");
        rep = rep.replaceAll("l","t");

        return rep;
    }

    public static void main(String[] args) {

        System.out.println("Enter the String: ");
        Scanner in = new Scanner(System.in);

        System.out.println("Replaced string is: "+replace(in.nextLine()));
    }
}
