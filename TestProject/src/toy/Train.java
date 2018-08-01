package toy;

public class Train extends ToyBuilder implements ToyMove {

    @Override
    public void immovable()
    {
        System.out.println("Not necessary!");
    }

    @Override
    public void move()
    {
        System.out.println("Moves");
    }
}
