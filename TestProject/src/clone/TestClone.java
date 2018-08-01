package clone;

public class TestClone {

    public static void main(String[] args) throws CloneNotSupportedException {

        CopyOfObject obj1 = new CopyOfObject();

        obj1.a = 10;
        obj1.b = 20;

        CopyOfObject obj2 = (CopyOfObject)obj1.clone();

        obj2.a = 100;
        obj2.b = 200;

        System.out.println(obj1.a);
        System.out.println(obj1.b);

        System.out.println(obj2.a);
        System.out.println(obj2.b);
    }
}
