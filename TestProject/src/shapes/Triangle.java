package shapes;

public class Triangle extends Shape {

    @Override
    public void draw()
    {
        System.out.println("Draws shapes.Triangle");
    }

    @Override
    public void erase()
    {
        System.out.println("Erases shapes.Triangle");
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.draw();
        t.erase();
    }
}
