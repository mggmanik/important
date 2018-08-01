package exercise;

public class DifferentTypesOfExceptions {

    public static void negativeSizeException()
    {
        int[] arr = new int[-4];
    }

    public static void arrayOutOfBoundException()
    {
        int[] arr = new int[2];
        System.out.println(arr[3]);
    }

    public static void nullException()
    {
        String str=null;
        if(str.equals("manik"))
            System.out.println("Same");
        else
            System.out.println("not same");
    }

    public static void main(String[] args) {

        try {
            negativeSizeException();
            arrayOutOfBoundException();
            nullException();
        }
        catch (NegativeArraySizeException  | ArrayIndexOutOfBoundsException | NullPointerException e)
        {
            System.out.println("Getting NegativeArraySizeException");
            System.out.println("Getting ArrayIndexOutOfBoundException");
            System.out.println("Getting NullPointerException");
        }
    }
}
