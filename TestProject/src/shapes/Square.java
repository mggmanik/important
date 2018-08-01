package shapes;

public class Square extends Shape {

    @Override
    public void draw()
    {
        System.out.println("Draws shapes.Square");
    }

    @Override
    public void erase()
    {
        System.out.println("Erases shapes.Square");
    }

    public static void main(String[] args) {
        Square s = new Square();
        s.draw();
        s.erase();
    }
}
