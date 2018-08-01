package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveVowels {

    public static void main(String[] args) {

        int num;
        List<String> li = new ArrayList<>();
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the number of places: ");
        num = in.nextInt();

        System.out.println("Enter the places: ");

        for (int i=0;i<num;i++)
        {
            li.add(in.next());
        }

        removeVowels(li);
    }

    public static void removeVowels(List<String> al)
    {
        for(int i = 0;i<al.size();i++)
        {
            String s = al.get(i);
            int count;
            String s1=s.replaceAll("a|e|i|o|u","");
            count = s.length()-s1.length();
            System.out.print("Place name without vowels:"+count+" ");
            al.set(i,s1);
            System.out.print(al.get(i)+"\n");
        }
    }
}
