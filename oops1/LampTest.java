package oopsdemo1;

/**
 * Author : sirin
 * Date : Jul 7, 2026
 * Time : 9:23:13 AM
 * Email : sirinandini.a@gmail.com
 */

// Instance Class
class Lamp {

    // stores the value for light
    // true if light is on
    // false if light is off
    private boolean isOn;

    // method to turn on the light
    public void turnOn() {
        isOn = true;
        System.out.println("Light On? " + isOn);
    }

    // method to turn off the light
    public void turnOff() {
        isOn = false;
        System.out.println("Light On? " + isOn);
    }
}

// Main Class
public class LampTest {

    public static void main(String[] args) {

        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        led.turnOn();
        halogen.turnOn();

        led.turnOff();
        halogen.turnOff();
    }
}