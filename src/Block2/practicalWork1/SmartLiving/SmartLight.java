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
        System.out.println("--------------------");
        if (brightness < MAX_BRIGHTNESS) {
            brightness++;
            System.out.println(name + " яркость увеличена до: " + brightness);
        } else {
            System.out.println(name + " яркость максимальная " + MAX_BRIGHTNESS);
        }
    }

    @Override
    public void decreaseValue() {
        System.out.println("--------------------");
        if (brightness > MIN_BRIGHTNESS) {
            brightness--;
            System.out.println(name + " яркость уменьшена до: " + brightness);
        } else {
            System.out.println(name + " яркость минимальная " + MIN_BRIGHTNESS);
        }
    }

    public String getStatus() {
        System.out.println("--------------------");
        if (isOn) {
            return name + ", " + room + ", ВКЛ";
        } else {
            return name + ", " + room + ", ВЫКЛ";
        }
    }

}
