package Block2.practicalWork1.JavaBeans;

public class Main {

    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();

        // создаем товары
        Coffee latte1 = new Coffee("Латте", 150.0, Size.SMALL);
        Coffee latte2 = new Coffee("Латте", 250.0, Size.MEDIUM);
        Coffee latte3 = new Coffee("Латте", 350.0, Size.LARGE);
        Tea tea1 = new Tea("Черный чай", 100.0, Size.SMALL);
        Tea tea2 = new Tea("Черный чай", 150.0, Size.MEDIUM);
        Tea tea3 = new Tea("Черный чай", 250.0, Size.LARGE);
        Pastry croissant = new Pastry("Круассан", 100);
        Pastry cupcake = new Pastry("Кекс ", 100);
        Pastry cake = new Pastry("Пирожное ", 100);

        //добавляем товары в меню
        shop.addItem(latte1);
        shop.addItem(latte2);
        shop.addItem(latte3);
        shop.addItem(tea1);
        shop.addItem(tea2);
        shop.addItem(tea3);
        shop.addItem(croissant);
        shop.addItem(cupcake);
        shop.addItem(cake);

        //выводим меню
        shop.printMenu();

        //оформляем заказы
        latte1.setCoffeeStrength(CoffeeStrength.STRONG);
        shop.makeOrder(latte1);

        tea3.setTeaMode(TeaMode.HOT);
        shop.makeOrder(tea3);

        cupcake.setPastryType(PastryType.WITHOUTSUGAR);
        shop.makeOrder(cupcake);

        //готовим заказы
        shop.prepareOrder(latte1);
        shop.prepareOrder(tea3);

        //статистика продаж
        System.out.println(CoffeeShop.CoffeeShopStats.getStats());

    }
}
