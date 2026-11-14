package Block2.practicalWork1.SmartLiving;

public abstract class SmartDevice {
    protected  String name;
    protected boolean isOn;
    protected RoomType room;

    public SmartDevice(String name, RoomType room) {
        this.name = name;
        this.isOn = false;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }

    public RoomType getRoom() {
        return room;
    }

    public final void turnOn(){
        isOn = true;
    }

    public final void turnOff(){
        isOn = false;
    }

    public abstract String getStatus();

}
