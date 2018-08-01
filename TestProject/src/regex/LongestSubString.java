package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestSubString {

    public static void main(String[] args) {
//        String str = "84375847598437";
//
//        Pattern p = Pattern.compile(".*[^0-9].*");
//        Matcher m = p.matcher(str);
//
//        while (m.find()) {
////            int start = m.start(0);
////            int end = m.end(0);
//            System.out.println(str.substring(m.start(), m.end()));
//        }

        String regex = "[0-9]+";
        String data = "23343453";
        System.out.println(data.matches(regex));
    }
}
