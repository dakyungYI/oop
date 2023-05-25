package oop2;

public class Address {
    private String line1;
    private String city;
    private String zip; //우편번호

    //cration
    //주소를 어떻게 생성해야할지 생각
    //간단하게 생각하려면 모든 항목이 필수 사항이라고 가정하기 -> 모든 항목을 생성자 만들기
    //꼭 필요한 사항이 아닐 경우 해당 항목에 대해서는 setter를 생성 (이번 예시에서는 모든 항목이 필수라고 가정)

    public Address(String line1, String city, String zip) {
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    }

    public String toString() {
        return line1 + " " + city + " " + zip;
    }
}
