package Block2.practicalWork1.SmartLiving;

public class Main {

    static void main(String[] args) {

        SmartHome myHome = new SmartHome();

        SmartLight livingRoomLight = new SmartLight("Люстра", RoomType.ГОСТИНАЯ);
        SmartThermostat bedroomThermostat = new SmartThermostat("Термостат", RoomType.ВАННАЯ);
        SmartTV kitchenTV = new SmartTV("Телевизор", RoomType.КУХНЯ);

        myHome.addDevice(livingRoomLight);
        myHome.addDevice(bedroomThermostat);
        myHome.addDevice(kitchenTV);

        myHome.turnOnDevice("Люстра");
        myHome.turnOnDevice("Телевизор");

        myHome.increaseValue("Люстра");
        myHome.increaseValue("Телевизор");

        myHome.printAllStatuses();

        SmartHome.HomeStats.printStats();

    }
}
