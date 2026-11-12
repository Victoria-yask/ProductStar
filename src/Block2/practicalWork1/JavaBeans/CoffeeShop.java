package Block2.practicalWork1.JavaBeans;
import java.util.List;
import java.util.ArrayList;

public class CoffeeShop {

    private List<MenuItem> menuItems = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    //Добавление товара в меню
    public void addItem(MenuItem item){
        menuItems.add(item);
    }

    //вывод меню
    public void printMenu() {
        System.out.println("--- МЕНЮ КОФЕЙНИ ---");
        for (MenuItem item : menuItems) {
            System.out.println(item.getDescriptionMenu());
        }
    }

    //класс Order
    private class Order {
        private MenuItem item;
        private Size size;

        public Order(MenuItem item) {
            this.item = item;
            this.size = item.getSize();
        }
    }

    //оформить заказ
    public void makeOrder(MenuItem item) {
        Order order = new Order(item);
        orders.add(order);
        System.out.println("--------------------");
        System.out.println("Заказ: " + item.getDescriptionOrder());
        CoffeeShopStats.addOrder(item.getPrice());
    }

    //приготовить заказ
    public void prepareOrder(MenuItem item) {
        System.out.println("--------------------");
        if (item instanceof Preparable preparableItem) {
            preparableItem.prepare();
        } else {
            System.out.println("Готов " + item.getName());
        }
    }

    //статистика продаж
    public static class CoffeeShopStats{
        private static int totalOrders = 0;
        private static double totalRevenue = 0;

        public static void addOrder(double price) {
            totalOrders++;
            totalRevenue += price;
        }

        public static String getStats() {
            return "--- Статистика продаж ---\n"
                    + "Всего заказов: " + totalOrders
                    + "\nВыручка: " + totalRevenue;
        }
    }
}
