package toy;

public class Car extends ToyBuilder implements ToyMove {

    @Override
    public void immovable()
    {
        System.out.println("Not Necessary to move!");
    }

    @Override
    public void move()
    {
        System.out.println("Moves");

    }
}
