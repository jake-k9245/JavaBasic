package chapter2.interfaceexample.v3;

public class Tv implements App {

    @Override
    public void turnOn() {

        System.out.println("전원을 켭니다.");

    }

    @Override
    public void turnOff() {

        System.out.println("전원을 끕니다.");

    }

    void movie() {

        System.out.println("영화를 시작합니다.");

    }


}


