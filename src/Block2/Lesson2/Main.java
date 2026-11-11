package Block2.Lesson2;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(" ", -1, 500, CarType.SEDAN);

        System.out.println("Управляем машиной " + car.getName() +
                " мощность " + car.getPower() + " вес " + car.getWeight() +
                " тип " + car.getType());

        car.startEngine();
        car.turnSteeringWheel();
        car.stopEngine();
    }
}
