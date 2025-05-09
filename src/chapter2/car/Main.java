package chapter2.car;

import chapter2.car.Car;

public class Main {

    public static void main(String[] args) {

//        Car carA = new Car("KIA", "K", 9);
//        Car carB = new Car("Hyun", "EV", 5);
//
//        int result1 = carA.sum(1, 2);
//        int result2 = carB.sum(3, 4);
//        System.out.println("result1 = " + result1);
//        System.out.println("result2 = " + result2);
//
//        // 게터
//        String name = carA.getName();
//        System.out.println("name = " + name);
//
//        // 세터
//        System.out.println("personA 의 주소 : " + carA.num);
//        carA.setNum(55);
//        System.out.println("personA 의 주소 : " + carA.num);

        // 자동차 객체 생성
        Car myCar = new Car("나의 자동차", "크루즈");
        myCar.drive();
    }
}
