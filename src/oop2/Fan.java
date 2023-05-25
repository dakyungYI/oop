package oop2;

public class Fan {
    //상태 변수 state
    private String make;
    private double radius; //지름
    private String color;

    private boolean isOn;  //선풍기가 켜져있는지 여부
    private int speed; //0 to 5


    //생성 creation
    //어떤 생성자를 사용할지 고려할 때는 상태 변수 부분에서 이 객체에 없으면 안되는 게 무엇인지 생각해봐야함
    //make, radius, color (변하면 안되는 요소들)
    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    //변수 생성 (변하는 요소들)
    //isOn
    public void switchOn() {
        this.isOn = true;
        setSpeed((int) 5);
    }
    public void switchOff() {
        this.isOn = false;
        setSpeed((int) 0);
    }

    //speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }


    //출력하기 print the state
    public String toString() {
        return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d",
                make, radius, color, isOn, speed);
    }

}
