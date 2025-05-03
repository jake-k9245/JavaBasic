package chapter1.condition;

import java.util.Scanner;

public class TrafficLight {

    public static void main(String[] args) {

        // Q1. 신호등 색상을 입력하면 프로그램이 올바른 안내 메시지를 출력하도록 만드세요!

        // 처리해야 할 조건
        // 1. "초록불" -> "건너세요!" 출력
        // 2. "노란불: -> "주의하세요!" 출력
        // 3. "빨간불" -> "멈추세요!" 출력
        // 4. 그 외의 갑이 입력되면 -> "잘못된 입력입니다." 출력

        Scanner scanner = new Scanner(System.in);

        System.out.print("신호등을 생상을 입력하세요 (초록불, 노란불, 빨간불) : ");

        String light = scanner.nextLine();

        // if
//        if (light.equals("초록불")) {
//            System.out.println("건너세요");
//
//        } else if (light.equals("노란불")) {
//            System.out.println("주의하세요!");
//
//        } else if (light.equals("빨간불")) {
//            System.out.println("멈추세요!");
//
//        }  else {
//            System.out.println("잘못된 입력입니다.");
//        }

        // switch

        switch (light) {
            case "초록불":
                System.out.println("건너세요!");
                break;
            case "노란불":
                System.out.println("주의하세요!");
                break;
            case "빨간불":
                System.out.println("멈추세요!");
                break;
            default:
                System.out.println("잘못된 입력입니다.");

        }

    }
}
