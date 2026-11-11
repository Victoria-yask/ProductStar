package Block2.practicalWork1.SmartLiving;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {
    private List<SmartDevice> devices;

    public SmartHome() {
        this.devices = new ArrayList<>();
    }

    //добавить устройство в систему
    public void addDevice(SmartDevice device) {
        devices.add(device);
        HomeStats.incrementTotalDevices();
    }

    // Включить устройство по имени
    public void turnOnDevice(String name) {
        for (SmartDevice device : devices) {
            if (device.getName().equals(name)) {
                device.turnOn();
                return;
            }
        }
    }

    // Выключить устройство по имени
    public void turnOffDevice(String name) {
        for (SmartDevice device : devices) {
            if (device.getName().equals(name)) {
                device.turnOff();
                return;
            }
        }
    }

    // Управление устройством - увеличить
    public void increaseValue(String name) {
        for (SmartDevice device : devices) {
            if (device.getName().equals(name) && device instanceof Controllable c)
            {
                c.increaseValue();
                return;
            }
        }
    }

    // Управление устройством - уменьшить
    public void decreaseValue(String name) {
        for (SmartDevice device : devices) {
            if (device.getName().equals(name) && device instanceof Controllable c) {
                c.decreaseValue();
                return;
            }
        }
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

