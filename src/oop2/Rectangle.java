package oop2;

public class Rectangle {
    //상태 변수 state
    private int length;
    private int width;

    //생성자 creation
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //operations

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    //또 사용할 수 있는 operations에는 면적, 둘레..
    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }


    //직사각형의 현재 상태 //toString을 통해 현재 상태 값을 받을 수 있음
    public String toString() {
        return String.format("length - %d width - %d area - %d perimeter - %d",
                length, width, area(), perimeter());
    }





}
