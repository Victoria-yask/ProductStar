package Block2.practicalWork1.SmartLiving;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {
    private List<SmartDevice> devices = new ArrayList<>();;

    //добавить устройство в систему
    public void addDevice(SmartDevice device) {
        devices.add(device);
        HomeStats.incrementTotalDevices();
    }

    // Включить устройство
    public void turnOnDevice(SmartDevice device) {
        device.turnOn();
        SmartHome.HomeStats.incrementActiveDevices();
    }

    // Выключить устройство
    public void turnOffDevice(SmartDevice device) {
        device.turnOff();
        SmartHome.HomeStats.decrementActiveDevices();
    }

    // Управление устройством - увеличить
    public void increaseValue(Controllable device) {
        device.increaseValue();
    }

    // Управление устройством - уменьшить
    public void decreaseValue(Controllable device) {
        device.decreaseValue();
    }

    // Показать статус всех устройств
    public void printAllStatuses() {
        System.out.println("\n--- Статусы устройств ---");
        for (SmartDevice device : devices) {
            System.out.println(device.getStatus());
        }
    }

    //статистика использования устройств
    public static class HomeStats {
        private static int totalDevices = 0;
        private static int activeDevices = 0;

        public static void incrementTotalDevices() {
            totalDevices++;
        }

        public static void incrementActiveDevices() {
            activeDevices++;
        }

        public static void decrementActiveDevices() {
            if (activeDevices > 0)
                activeDevices--;
        }

        public static void printStats() {
            System.out.println("\n--- Статистика умного дома ---");
            System.out.println("Всего устройств: " + totalDevices);
            System.out.println("Активных устройств (включено): " + activeDevices);
        }
    }
}

