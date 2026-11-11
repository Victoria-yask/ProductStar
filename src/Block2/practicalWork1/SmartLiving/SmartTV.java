package Block2.practicalWork1.SmartLiving;

public class SmartTV extends SmartDevice implements Controllable{
    private int channel;
    private static final int MIN_CHANNEL = 1;
    private static final int MAX_CHANNEL = 5;

    public SmartTV(String name, RoomType room) {
        super(name, room);
        this.channel = MIN_CHANNEL;
    }

    @Override
    public void increaseValue() {
        if (channel < MAX_CHANNEL) {
        channel++;
        System.out.println(name + " канал переключен на " + channel);
    } else {
            System.out.println(name + " максимальный канал " + MAX_CHANNEL);
        }
    }

    @Override
    public void decreaseValue() {
        if (channel > 1) {
            channel--;
            System.out.println(name + " канал переключен на " + channel);
        } else {
            System.out.println(name + " минимальный канал " + MIN_CHANNEL);
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
