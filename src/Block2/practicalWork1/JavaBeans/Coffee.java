package Block2.practicalWork1.JavaBeans;

public class Coffee extends MenuItem implements Preparable {
    private CoffeeStrength coffeeStrength;
    private Size size;

    public Coffee(String name, double price, Size size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public Size getSize() {
        return size;
    }

    public void setCoffeeStrength(CoffeeStrength coffeeStrength) {
        this.coffeeStrength = coffeeStrength;
    }

    @Override
    public String getDescriptionMenu() {
        return name + " цена: " + price + " размер: " + size;
    }

    @Override
    public String getDescriptionOrder() {
        return name + " цена: " + price + " размер: " + size + " крепость: " + coffeeStrength;
    }
    @Override
    public void prepare() {
        System.out.println("Готов " + name);
    }
}

