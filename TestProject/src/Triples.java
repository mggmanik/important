public class Triples {

    public static boolean noTriples(int[] arr)
    {
        int maxCount = 0;
        int count=1;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]==arr[i]) {
                count++;
            }
            else
                if (count>maxCount)
                {
                    maxCount=count;
                    count=1;
                }
            if(maxCount >= 3)
            {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(noTriples(new int[]{1,1,1,2,2,1}));
    }
}
