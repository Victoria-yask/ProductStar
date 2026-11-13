package Block2.practicalWork1.JavaBeans;

public class Pastry extends MenuItem {
    private PastryType pastryType;

    public Pastry(String name, double price) {
        super(name, price);
    }

    public void setPastryType(PastryType pastryType) {
        this.pastryType = pastryType;
    }

    @Override
    public String getDescriptionMenu() {
        return name + " цена: " + price;
    }

    @Override
    public String getDescriptionOrder() {
        return name + " цена: " + price + " тип: " + pastryType;
    }
}
