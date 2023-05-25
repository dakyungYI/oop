package interfacee;

public class DummyAlgorithm implements ComplexAlgorithm{
    @Override
    public int complexAlgorithm(int number1, int number2) {
        return number1 + number2;
    }
}

interface Interface1 {
    void method1();
}
interface Interface2 extends Interface1 {
    void method2();
}
class Implementation implements Interface2 {
    void method2() {
    }
}
//인터페이스를 연장할 수 있지만 두번째 인터페이스를 구현하고 싶으면 연장하려는 인터페이스와 연장하는 인터페이스의 메소드들을 구현해야함
class Implementation implements Interface2 {
    public void method2() {
    }
    public void method1() {
    }
}