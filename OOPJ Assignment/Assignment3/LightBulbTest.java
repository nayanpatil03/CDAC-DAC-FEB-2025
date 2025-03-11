public class LightBulb {
    boolean isOn; // to check if the bulb is ON or OFF

    void switchOn() {
        isOn = true;
        System.out.println("The light bulb is ON.");
    }

    void switchOff() {
        isOn = false;
        System.out.println("The light bulb is OFF.");
    }

    void checkStatus() {
        if (isOn) {
            // System.out.println("LightBulb status: " + (isOn ? "ON" : "OFF"));
            System.out.println("The light bulb is currently ON.");
        } else {
            System.out.println("The light bulb is currently OFF.");
        }
    }

}

class LightBulbTest {
    public static void main(String[] args) {
        LightBulb bulb = new LightBulb(); // Creating an instance(object) of LightBulb

        bulb.checkStatus();
        bulb.switchOn();
        bulb.checkStatus();
        bulb.switchOff();
        bulb.checkStatus();
    }
}
