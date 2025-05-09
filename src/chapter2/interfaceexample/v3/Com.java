package chapter2.interfaceexample.v3;

public class Com implements App {

    @Override
    public void turnOn() {

        System.out.println("전원을 켭니다.");

    }

    @Override
    public void turnOff() {

        System.out.println("전원을 끕니다.");

    }

    void print() {

        System.out.println("프린트르 출력 합니다.");
    }
}
