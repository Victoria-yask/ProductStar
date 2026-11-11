package Block2.practicalWork1.SmartLiving;

public class SmartThermostat extends SmartDevice implements Controllable {
    private int temperature;
    private static final int MIN_TEMPERATURE = 5;
    private static final int MAX_TEMPERATURE = 30;

    public SmartThermostat(String name, RoomType room) {
        super(name, room);
        this.temperature = MIN_TEMPERATURE;
    }

    @Override
    public void increaseValue() {
        if (temperature < MAX_TEMPERATURE) {
            temperature++;
            System.out.println(name + " температура увеличена до: " + temperature);
        } else {
            System.out.println(name + " температура максимальная " + MAX_TEMPERATURE);
        }
    }

    @Override
    public void decreaseValue() {
        if (temperature > MIN_TEMPERATURE) {
            temperature--;
            System.out.println(name + " температура уменьшена до: " + temperature);
        } else {
            System.out.println(name + " температура минимальная " + MIN_TEMPERATURE);
        }
    }

    @Override
    public String getStatus() {
        if (isOn) {
            return name + ", " + room + ", ВКЛ";
        } else {
            return name + ", " + room + ", ВЫКЛ";
        }
    }
}

