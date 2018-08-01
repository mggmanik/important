public class StringBitsDemo {

    public static String stringBits(String str)
    {
        char[] gapS = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i+=2)
        {
            sb.append(gapS[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(stringBits("heeololeo"));
    }
}
