package Block2.Lesson2;

public class Car {
    private String name;
    private int power;
    private int weight;
    private CarType type;

    private Engine engine;
    private SteeringWheel steeringWheel;


    public Car(String name, int power, int weight, CarType type) {
        this.name = name;
        this.power = power;
        this.weight = weight;
        this.type = type;

        this.engine = new Engine();
        this.steeringWheel = new SteeringWheel();
    }

    public String getName() {
        return this.name == null? "": this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = Math.max(power, 0);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public void startEngine() {
        engine.start();
    }

    public void stopEngine() {
        engine.stop();
    }

    public void turnSteeringWheel() {
        steeringWheel.turn();
    }
}
