package Block2.practicalWork1.SmartLiving;

public class SmartLight extends SmartDevice implements Controllable{
    private int brightness;
    private static final int MIN_BRIGHTNESS = 1;
    private static final int MAX_BRIGHTNESS = 3;

    public SmartLight(String name, RoomType room) {
        super(name, room);
        this.brightness = MIN_BRIGHTNESS;
    }

    @Override
    public void increaseValue() {
        if (brightness < MAX_BRIGHTNESS) {
            brightness++;
            System.out.println(name + " яркость увеличена до: " + brightness);
        } else {
            System.out.println(name + " яркость максимальная " + MAX_BRIGHTNESS);
        }
    }

    @Override
    public void decreaseValue() {
        if (brightness > MIN_BRIGHTNESS) {
            brightness--;
            System.out.println(name + " яркость уменьшена до: " + brightness);
        } else {
            System.out.println(name + " яркость минимальная " + MIN_BRIGHTNESS);
        }
    }

    public String getStatus() {
        if (isOn) {
            return name + ", " + room + ", ВКЛ";
        } else {
            return name + ", " + room + ", ВЫКЛ";
        }
    }

}
