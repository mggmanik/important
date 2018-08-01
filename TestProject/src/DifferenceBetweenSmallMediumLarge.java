import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DifferenceBetweenSmallMediumLarge {

    public static boolean evenlySpaced(int a, int b, int c)
    {
        int small,medium,large,diff,diff1;

        List<Integer> li  = new ArrayList<>();
        li.add(a);
        li.add(b);
        li.add(c);
        Collections.sort(li);

        small = li.get(0);
        medium = li.get(1);
        large = li.get(2);
        diff = large-medium;
        diff1 = medium-small;
        if(diff == diff1)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(evenlySpaced(4,6,3));
    }
}
