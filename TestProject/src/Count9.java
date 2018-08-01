public class Count9 {

    public static int arrayCount9(int[] arr)
    {
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==9)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println("No. of 9's are: "+arrayCount9(new int[]{1,9,9,3,9}));
    }
}
