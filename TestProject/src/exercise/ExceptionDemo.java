package exercise;

public class ExceptionDemo {

    public static int check(int n) throws Exception
    {
        if(n==5)
            throw new Exception("No! Can't be equal to 5!");
        return n;
    }

    public static void main(String[] args){

        try
        {
            check(5);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I was here");
        }

    }
}
