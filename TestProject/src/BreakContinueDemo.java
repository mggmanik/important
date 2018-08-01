public class BreakContinueDemo {

    public static void breakDemo(int num)
    {
        System.out.println("Break Demo");
        for(int i = 0 ;i<num;i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.println(i);
        }
    }
    public static void continueDemo(int num)
    {
        System.out.println("Continue Demo");
        for(int i = 0 ;i<num;i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        breakDemo(10);
        continueDemo(10);
    }
}
