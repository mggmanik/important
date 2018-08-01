package singleton;

public class SingletonDemo {

    private static SingletonDemo sd  = null;

    private SingletonDemo()
    {
        System.out.println("I can have only one object! ");
    }

    public static SingletonDemo getInstance()
    {
        if(sd == null)
        {
            sd = new SingletonDemo();
        }
        return sd;
    }
}