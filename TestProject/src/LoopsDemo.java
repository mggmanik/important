public class LoopsDemo {

//    we have 3 basic loops in Java: while(), for(), do-while()

    public static void forDemo(int num)
    {
        System.out.println("For Loop:");
        for(int i = 0;i<num;i++)
        {
            System.out.println(i);
        }
    }
    public static void whileDemo(int num)
    {
        System.out.println("While Loop:");
        int i = 0;
        while(i<num)
        {
            System.out.println(i);
            i++;
        }
    }
    public static void doWhileDemo(int num)
    {
        System.out.println("do-while Loop:");
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }while (i<num);
    }
    public static void main(String[] args) {

        forDemo(10);
        whileDemo(15);
        doWhileDemo(20);
    }
}
