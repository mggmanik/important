package regex;

import java.util.Scanner;

public class CountCharacterFrequency {

    public static int count(char character, String str)
    {
        String str2 = str.replaceAll(Character.toString(character),"");
        int number = str.length()-str2.length();

        return number;
    }

    public static void main(String[] args) {

        String string;
        char ch;
        System.out.println("Enter the String: ");
        Scanner in = new Scanner(System.in);
        string = in.nextLine();
        System.out.println("Enter the character: ");
        ch = in.next().charAt(0);
        System.out.println("No. of occurrences: "+count(ch,string));
    }
}
