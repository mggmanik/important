import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void main(String[] args) {


        List<String> str = new ArrayList<>();

        str.add("apple");
        str.add("banana");
        str.add("mango");

        for (String s: str) {

            int count = 0;
            for(int i = 0; i<s.length(); i++)
            {
                if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' )
                {
                    count++;
                }
            }
            System.out.println(s+" has "+count+" vowel(s)!");

        }

    }
}
