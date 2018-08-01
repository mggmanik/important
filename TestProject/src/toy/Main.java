package toy;

public class Main {

    public static void main(String[] args) {

        Car newCar = new Car();

        newCar.setPrice(500);
        newCar.setColor("Red");
        newCar.move();
        newCar.immovable();

        Train newTrain = new Train();

        newTrain.setPrice(1000);
        newTrain.setColor("Blue");
        newTrain.move();
        newTrain.immovable();

        Plane newPlane = new Plane();
        newPlane.setPrice(2000);
        newPlane.setColor("Black");
        newPlane.fly();
        newPlane.immovable();

        System.out.println(newCar.getPrice());
        System.out.println(newCar.getColor());
        System.out.println(newTrain.getPrice());
        System.out.println(newTrain.getColor());
        System.out.println(newPlane.getPrice());
        System.out.println(newPlane.getColor());
    }
}
