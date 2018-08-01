package toy;

public class Plane extends ToyBuilder implements ToyMove,ToyFly {

    @Override
    public void immovable()
    {
        System.out.println("Not Necessary!");
    }

    @Override
    public void fly()
    {
        System.out.println("Flies!");
    }

    @Override
    public void move()
    {
        System.out.println("Also can move!");
    }
}
