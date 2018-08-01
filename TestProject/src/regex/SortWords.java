package regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortWords {

    public static List<String> sort(String paragraph)
    {

        List<String> li = new ArrayList<>();
        String[] words = paragraph.trim().split("\\s");

        for(int i=0;i<words.length;i++)
        {
            li.add(words[i]);
        }

        Collections.sort(li);
        return li;
    }

    public static void main(String[] args) {

        String para;
        System.out.println("Enter a sentence: ");
        Scanner in = new Scanner(System.in);
        para = in.nextLine();

        List<String> al = sort(para);
        System.out.println("Sorted alphabetically: ");
        for (String s : al)
        {
            System.out.println(s);
        }
    }
}
