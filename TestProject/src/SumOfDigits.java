public class SumOfDigits {

    public static int  sumDigits(String str)
    {
        char[] nums = str.toCharArray();
        int sum = 0,n;

        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(nums[i])) {
                n = nums[i] - '0';
                sum += n;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits("aa11b33"));
    }
}
