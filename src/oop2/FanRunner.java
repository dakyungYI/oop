package oop2;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Maunfacture1", 0.34567, "GREEN");
        fan.switchOn();
        System.out.println(fan);
        fan.setSpeed((int) 3);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }
}
