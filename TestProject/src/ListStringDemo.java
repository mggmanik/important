import java.util.ArrayList;
import java.util.List;

public class ListStringDemo {

    public static List<String> copies3(List<String> li)
    {
        for(int i=0;i<li.size();i++)
        {
            String s = li.get(i);
            s=s+s+s;
            li.set(i,s);
        }
        return li;
    }

    public static void main(String[] args) {

        List<String> al = new ArrayList<>();
        al.add("hello");
        al.add("there");
//        al.add("");

        System.out.println(copies3(al));
    }
}
