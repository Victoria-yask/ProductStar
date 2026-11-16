package Block2.practicalWork1.JavaBeans;

public class Tea extends MenuItem implements Preparable{
    private Size size;

    public Tea(String name, double price, Size size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String getDescriptionMenu() {
        return name + " цена: " + price + " размер: " + size;
    }

    @Override
    public void prepare() {
        System.out.println("Готов " + name);
    }
}
