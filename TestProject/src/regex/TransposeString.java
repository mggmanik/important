package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TransposeString {

    public static List<String> transposeWords(String original)
    {
        List<String> al = new ArrayList<>();

        String[] words = original.trim().split("\\s");

        for(int i=0;i<words.length;i++)
        {
            StringBuilder sb = new StringBuilder(words[i]);
            al.add(sb.reverse().toString());
        }
        return al;
    }

    public static void main(String[] args) {

        String original;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String:");
        original = in.nextLine();

        List<String> li = transposeWords(original);

        for (String s: li)
        {
            System.out.print(s+" ");
        }

    }
}
