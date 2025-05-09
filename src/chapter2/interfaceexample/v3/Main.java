package chapter2.interfaceexample.v3;

public class Main {

    public static void main(String[] args) {

        Tv tv = new Tv();
        Air air = new Air();
        Com com = new Com();

        tv.turnOn();
        air.turnOn();
        com.turnOn();

        tv.turnOff();
        air.turnOff();
        com.turnOff();

        tv.movie();
        air.heater();
        com.print();

    }
}
