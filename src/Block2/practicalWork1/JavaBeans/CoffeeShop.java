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

        // Дополнительные параметры конкретного заказа
        private CoffeeStrength coffeeStrength;
        private TeaMode teaMode;
        private PastryType pastryType;

        // Конструктор для Кофе
        public Order(Coffee coffee, CoffeeStrength strength) {
            this.item = coffee;
            this.size = coffee.getSize();
            this.coffeeStrength = strength;
        }

        // Конструктор для Чая
        public Order(Tea tea, TeaMode mode) {
            this.item = tea;
            this.size = tea.getSize();
            this.teaMode = mode;
        }

        // Конструктор для Выпечки
        public Order(Pastry pastry, PastryType type) {
            this.item = pastry;
            this.pastryType = type;
        }

        // Метод для красивого вывода чека
        public String getDescriptionOrder() {
            String desc = item.getName() + " цена: " + item.getPrice();

            if (size != null) {
                desc += " размер: " + size;
            }
            if (coffeeStrength != null) {
                desc += " крепость: " + coffeeStrength;
            }
            if (teaMode != null) {
                desc += " режим: " + teaMode;
            }
            if (pastryType != null) {
                desc += " тип: " + pastryType;
            }

            return desc;
        }
    }

    //оформить заказ
    public void makeOrder(Coffee coffee, CoffeeStrength strength) {
        Order order = new Order(coffee, strength);
        orders.add(order);
        System.out.println("--------------------");
        System.out.println("Заказ: " + order.getDescriptionOrder());
        CoffeeShopStats.addOrder(coffee.getPrice());
    }

    public void makeOrder(Tea tea, TeaMode mode) {
        Order order = new Order(tea, mode);
        orders.add(order);
        System.out.println("--------------------");
        System.out.println("Заказ: " + order.getDescriptionOrder());
        CoffeeShopStats.addOrder(tea.getPrice());
    }

    public void makeOrder(Pastry pastry, PastryType type) {
        Order order = new Order(pastry, type);
        orders.add(order);
        System.out.println("--------------------");
        System.out.println("Заказ: " + order.getDescriptionOrder());
        CoffeeShopStats.addOrder(pastry.getPrice());
    }

    //приготовить заказ
    public void prepareOrder(Preparable item) {
        System.out.println("--------------------");
        item.prepare();
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
