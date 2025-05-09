package chapter2.car;

public class Car {

//    // 1. 속성
//    String factory;
//    String name;
//    int num;
//
//    // 2. 생성자
//    Car(String factory, String name, int num) {
//        this.factory = factory;
//        this.name = name;
//        this.num = num;
//
//    }
//
//    // 3. 기능
//    int sum (int value1, int value2) {
//        int result = value1 + value2;
//        return result;
//    }
//
//    // 게터
//    String getName() {
//        return this.name;
//    }
//
//    // 세터
//    void setNum (int num) {
//        this.num = num;
//    }

    // 1. 속성
    String name;
    String carModel;

    // 2. 생성자
    public Car(String name, String carModel) {
        this.name = name;
        this.carModel = carModel;

    }

    // 3. 기능
    public void drive() {
        System.out.println(name + "[" + this.carModel + "] 을 주행을합니다.");

    }
}