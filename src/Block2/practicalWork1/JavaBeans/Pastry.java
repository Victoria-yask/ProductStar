package Block2.practicalWork1.JavaBeans;

public class Pastry extends MenuItem {

    public Pastry(String name, double price) {
        super(name, price);
    }


    @Override
    public String getDescriptionMenu() {
        return name + " цена: " + price;
    }

}
