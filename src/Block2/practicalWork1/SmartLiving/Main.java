package Block2.practicalWork1.SmartLiving;

public class Main {

    static void main(String[] args) {

        SmartHome myHome = new SmartHome();

        //создаем устройства
        SmartLight livingRoomLight = new SmartLight("Люстра", RoomType.ГОСТИНАЯ);
        SmartThermostat bedroomThermostat = new SmartThermostat("Термостат", RoomType.ВАННАЯ);
        SmartTV kitchenTV = new SmartTV("Телевизор", RoomType.КУХНЯ);

        //добавляем устройства
        myHome.addDevice(livingRoomLight);
        myHome.addDevice(bedroomThermostat);
        myHome.addDevice(kitchenTV);

        //включаем устройства
        myHome.turnOnDevice(livingRoomLight);
        myHome.turnOnDevice(kitchenTV);
        myHome.turnOnDevice(bedroomThermostat);

        //управляем устройствами
        myHome.increaseValue(livingRoomLight);
        myHome.increaseValue(kitchenTV);
        myHome.decreaseValue(livingRoomLight);

        //выключаем устройства
        myHome.turnOffDevice(kitchenTV);

        //вывод статус устройств
        myHome.printAllStatuses();

        //вывод статистики
        SmartHome.HomeStats.printStats();

    }
}
