package shapes;

public class Circle extends Shape {

    @Override
    public void draw()
    {
        System.out.println("Draws shapes.Circle");
    }

    @Override
    public void erase()
    {
        System.out.println("Erases shapes.Circle");
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.erase();
    }
}
