public class LargestBlock {

    public static int maxBlock(String str) {
        int maxCount = 0;
        int count = 1;
        if (str.isEmpty()) {
            return 0;
        }
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                count++;
            } else if (count > maxCount) {
                maxCount = count;
                count = 1;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(maxBlock("abbCCCddddBBxx"));
    }
}
