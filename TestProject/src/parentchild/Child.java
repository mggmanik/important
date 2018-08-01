package parentchild;

public class Child extends Parent {

    @Override
    public void show(int p)
    {
        System.out.println(p+" ");
    }

    @Override
    public void print(int q)
    {
        System.out.println(q*q);
    }

    public static void main(String[] args) {

        Parent p = new Parent();
        Child c = new Child();

        p.show(1);
        p.print(2);
        c.show(3);
        c.print(4);
    }
}
