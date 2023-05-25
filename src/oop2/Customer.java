package oop2;

//Customer 클래스는 Adress 클래스의 인스턴스에 대해 참조 역할을 하는 것
//=> 객체 구성 관계
public class Customer {
    //state
    private String name;
    private Address homeAddress;
    private Address workAddress;

    //creating //필수요소-생성자
    public Customer(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }

    //operations //고객의 관점에서 볼 때 필요한 것
    public String getName() {
        return name;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public String toString() {
        return  String.format("name - [%s] home address - [%s] work address - [%s]",
                name, homeAddress, workAddress);
    }
}
