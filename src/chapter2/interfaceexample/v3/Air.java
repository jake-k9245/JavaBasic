package chapter2.interfaceexample.v3;

public class Air implements App {

    @Override
    public void turnOn() {

        System.out.println("전원을 켭니다.");

    }

    @Override
    public void turnOff() {

        System.out.println("전원을 끕니다.");

    }

    void heater() {

        System.out.println("히터를 작동합니다.");
    }
}
