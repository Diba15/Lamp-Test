public class Lamp {

    boolean isOn;
    boolean isAuto;

    public Lamp(boolean isOn, boolean isAuto) {
        this.isOn = isOn;
        this.isAuto = isAuto;
    }

    public void lampOn() {
        isOn = true;
    }

    public void lampAutoOn() {
        isAuto = true;
    }

    public void lampOff() {
        isOn = false;
    }

    public void lampAutoOff() {
        isAuto = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean isAuto() {
        return isAuto;
    }
}
